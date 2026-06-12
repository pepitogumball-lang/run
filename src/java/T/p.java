package T;

import android.view.View;
import android.content.pm.ActivityInfo;
import java.util.Iterator;
import android.content.pm.PackageManager;
import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import android.text.Editable;
import android.content.pm.ResolveInfo;
import android.content.Intent;
import android.app.Activity;
import java.util.ArrayList;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ActionMode;
import java.lang.reflect.Method;
import android.widget.TextView;
import android.view.ActionMode$Callback;

public final class p implements ActionMode$Callback
{
    public final ActionMode$Callback a;
    public final TextView b;
    public Class c;
    public Method d;
    public boolean e;
    public boolean f;
    
    public p(final ActionMode$Callback a, final TextView b) {
        this.a = a;
        this.b = b;
        this.f = false;
    }
    
    public final boolean onActionItemClicked(final ActionMode actionMode, final MenuItem menuItem) {
        return this.a.onActionItemClicked(actionMode, menuItem);
    }
    
    public final boolean onCreateActionMode(final ActionMode actionMode, final Menu menu) {
        return this.a.onCreateActionMode(actionMode, menu);
    }
    
    public final void onDestroyActionMode(final ActionMode actionMode) {
        this.a.onDestroyActionMode(actionMode);
    }
    
    public final boolean onPrepareActionMode(final ActionMode actionMode, final Menu obj) {
        final TextView b = this.b;
        final Context context = ((View)b).getContext();
        final PackageManager packageManager = context.getPackageManager();
        if (!this.f) {
            this.f = true;
            try {
                final Class<?> forName = Class.forName("com.android.internal.view.menu.MenuBuilder");
                this.c = forName;
                this.d = forName.getDeclaredMethod("removeItemAt", Integer.TYPE);
                this.e = true;
            }
            catch (final ClassNotFoundException | NoSuchMethodException ex) {
                this.c = null;
                this.d = null;
                this.e = false;
            }
        }
        try {
            Method method;
            if (this.e && this.c.isInstance(obj)) {
                method = this.d;
            }
            else {
                method = obj.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
            }
            int i = obj.size();
            --i;
            while (i >= 0) {
                final MenuItem item = obj.getItem(i);
                if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals((Object)item.getIntent().getAction())) {
                    method.invoke((Object)obj, new Object[] { i });
                }
                --i;
            }
            final ArrayList list = new ArrayList();
            if (context instanceof Activity) {
                for (final ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0)) {
                    if (!context.getPackageName().equals((Object)resolveInfo.activityInfo.packageName)) {
                        final ActivityInfo activityInfo = resolveInfo.activityInfo;
                        if (!activityInfo.exported) {
                            continue;
                        }
                        final String permission = activityInfo.permission;
                        if (permission != null && context.checkSelfPermission(permission) != 0) {
                            continue;
                        }
                    }
                    list.add((Object)resolveInfo);
                }
            }
            for (int j = 0; j < list.size(); ++j) {
                final ResolveInfo resolveInfo2 = (ResolveInfo)list.get(j);
                final MenuItem add = obj.add(0, 0, j + 100, resolveInfo2.loadLabel(packageManager));
                final Intent putExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", (b instanceof Editable && b.onCheckIsTextEditor() && ((View)b).isEnabled()) ^ true);
                final ActivityInfo activityInfo2 = resolveInfo2.activityInfo;
                add.setIntent(putExtra.setClassName(activityInfo2.packageName, activityInfo2.name)).setShowAsAction(1);
            }
            return this.a.onPrepareActionMode(actionMode, obj);
        }
        catch (final NoSuchMethodException | IllegalAccessException | InvocationTargetException ex2) {
            return this.a.onPrepareActionMode(actionMode, obj);
        }
    }
}
