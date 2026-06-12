package n;

import android.view.MenuItem$OnMenuItemClickListener;
import android.view.MenuItem$OnActionExpandListener;
import android.view.CollapsibleActionView;
import android.view.SubMenu;
import android.view.ContextMenu$ContextMenuInfo;
import android.content.Intent;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ActionProvider;
import android.content.Context;
import java.lang.reflect.Method;
import J.a;
import android.view.MenuItem;
import com.google.android.gms.internal.ads.vd;

public final class s extends vd implements MenuItem
{
    public final a c;
    public Method d;
    
    public s(final Context context, final a c) {
        super((Object)context);
        if (c != null) {
            this.c = c;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }
    
    public final boolean collapseActionView() {
        return ((MenuItem)this.c).collapseActionView();
    }
    
    public final boolean expandActionView() {
        return ((MenuItem)this.c).expandActionView();
    }
    
    public final ActionProvider getActionProvider() {
        final o b = this.c.b();
        if (b != null) {
            return b.a;
        }
        return null;
    }
    
    public final View getActionView() {
        View actionView;
        final View view = actionView = ((MenuItem)this.c).getActionView();
        if (view instanceof p) {
            actionView = (View)((p)view).C;
        }
        return actionView;
    }
    
    public final int getAlphabeticModifiers() {
        return this.c.getAlphabeticModifiers();
    }
    
    public final char getAlphabeticShortcut() {
        return ((MenuItem)this.c).getAlphabeticShortcut();
    }
    
    public final CharSequence getContentDescription() {
        return this.c.getContentDescription();
    }
    
    public final int getGroupId() {
        return ((MenuItem)this.c).getGroupId();
    }
    
    public final Drawable getIcon() {
        return ((MenuItem)this.c).getIcon();
    }
    
    public final ColorStateList getIconTintList() {
        return this.c.getIconTintList();
    }
    
    public final PorterDuff$Mode getIconTintMode() {
        return this.c.getIconTintMode();
    }
    
    public final Intent getIntent() {
        return ((MenuItem)this.c).getIntent();
    }
    
    public final int getItemId() {
        return ((MenuItem)this.c).getItemId();
    }
    
    public final ContextMenu$ContextMenuInfo getMenuInfo() {
        return ((MenuItem)this.c).getMenuInfo();
    }
    
    public final int getNumericModifiers() {
        return this.c.getNumericModifiers();
    }
    
    public final char getNumericShortcut() {
        return ((MenuItem)this.c).getNumericShortcut();
    }
    
    public final int getOrder() {
        return ((MenuItem)this.c).getOrder();
    }
    
    public final SubMenu getSubMenu() {
        return ((MenuItem)this.c).getSubMenu();
    }
    
    public final CharSequence getTitle() {
        return ((MenuItem)this.c).getTitle();
    }
    
    public final CharSequence getTitleCondensed() {
        return ((MenuItem)this.c).getTitleCondensed();
    }
    
    public final CharSequence getTooltipText() {
        return this.c.getTooltipText();
    }
    
    public final boolean hasSubMenu() {
        return ((MenuItem)this.c).hasSubMenu();
    }
    
    public final boolean isActionViewExpanded() {
        return ((MenuItem)this.c).isActionViewExpanded();
    }
    
    public final boolean isCheckable() {
        return ((MenuItem)this.c).isCheckable();
    }
    
    public final boolean isChecked() {
        return ((MenuItem)this.c).isChecked();
    }
    
    public final boolean isEnabled() {
        return ((MenuItem)this.c).isEnabled();
    }
    
    public final boolean isVisible() {
        return ((MenuItem)this.c).isVisible();
    }
    
    public final MenuItem setActionProvider(final ActionProvider actionProvider) {
        final o o = new o(this, actionProvider);
        o o2;
        if (actionProvider != null) {
            o2 = o;
        }
        else {
            o2 = null;
        }
        this.c.a(o2);
        return (MenuItem)this;
    }
    
    public final MenuItem setActionView(final int actionView) {
        final a c = this.c;
        ((MenuItem)c).setActionView(actionView);
        final View actionView2 = ((MenuItem)c).getActionView();
        if (actionView2 instanceof CollapsibleActionView) {
            ((MenuItem)c).setActionView((View)new p(actionView2));
        }
        return (MenuItem)this;
    }
    
    public final MenuItem setActionView(final View view) {
        Object actionView = view;
        if (view instanceof CollapsibleActionView) {
            actionView = new p(view);
        }
        ((MenuItem)this.c).setActionView((View)actionView);
        return (MenuItem)this;
    }
    
    public final MenuItem setAlphabeticShortcut(final char alphabeticShortcut) {
        ((MenuItem)this.c).setAlphabeticShortcut(alphabeticShortcut);
        return (MenuItem)this;
    }
    
    public final MenuItem setAlphabeticShortcut(final char c, final int n) {
        this.c.setAlphabeticShortcut(c, n);
        return (MenuItem)this;
    }
    
    public final MenuItem setCheckable(final boolean checkable) {
        ((MenuItem)this.c).setCheckable(checkable);
        return (MenuItem)this;
    }
    
    public final MenuItem setChecked(final boolean checked) {
        ((MenuItem)this.c).setChecked(checked);
        return (MenuItem)this;
    }
    
    public final MenuItem setContentDescription(final CharSequence contentDescription) {
        this.c.setContentDescription(contentDescription);
        return (MenuItem)this;
    }
    
    public final MenuItem setEnabled(final boolean enabled) {
        ((MenuItem)this.c).setEnabled(enabled);
        return (MenuItem)this;
    }
    
    public final MenuItem setIcon(final int icon) {
        ((MenuItem)this.c).setIcon(icon);
        return (MenuItem)this;
    }
    
    public final MenuItem setIcon(final Drawable icon) {
        ((MenuItem)this.c).setIcon(icon);
        return (MenuItem)this;
    }
    
    public final MenuItem setIconTintList(final ColorStateList iconTintList) {
        this.c.setIconTintList(iconTintList);
        return (MenuItem)this;
    }
    
    public final MenuItem setIconTintMode(final PorterDuff$Mode iconTintMode) {
        this.c.setIconTintMode(iconTintMode);
        return (MenuItem)this;
    }
    
    public final MenuItem setIntent(final Intent intent) {
        ((MenuItem)this.c).setIntent(intent);
        return (MenuItem)this;
    }
    
    public final MenuItem setNumericShortcut(final char numericShortcut) {
        ((MenuItem)this.c).setNumericShortcut(numericShortcut);
        return (MenuItem)this;
    }
    
    public final MenuItem setNumericShortcut(final char c, final int n) {
        this.c.setNumericShortcut(c, n);
        return (MenuItem)this;
    }
    
    public final MenuItem setOnActionExpandListener(final MenuItem$OnActionExpandListener menuItem$OnActionExpandListener) {
        Object onActionExpandListener;
        if (menuItem$OnActionExpandListener != null) {
            onActionExpandListener = new q(this, menuItem$OnActionExpandListener);
        }
        else {
            onActionExpandListener = null;
        }
        ((MenuItem)this.c).setOnActionExpandListener((MenuItem$OnActionExpandListener)onActionExpandListener);
        return (MenuItem)this;
    }
    
    public final MenuItem setOnMenuItemClickListener(final MenuItem$OnMenuItemClickListener menuItem$OnMenuItemClickListener) {
        Object onMenuItemClickListener;
        if (menuItem$OnMenuItemClickListener != null) {
            onMenuItemClickListener = new r(this, menuItem$OnMenuItemClickListener);
        }
        else {
            onMenuItemClickListener = null;
        }
        ((MenuItem)this.c).setOnMenuItemClickListener((MenuItem$OnMenuItemClickListener)onMenuItemClickListener);
        return (MenuItem)this;
    }
    
    public final MenuItem setShortcut(final char c, final char c2) {
        ((MenuItem)this.c).setShortcut(c, c2);
        return (MenuItem)this;
    }
    
    public final MenuItem setShortcut(final char c, final char c2, final int n, final int n2) {
        this.c.setShortcut(c, c2, n, n2);
        return (MenuItem)this;
    }
    
    public final void setShowAsAction(final int showAsAction) {
        ((MenuItem)this.c).setShowAsAction(showAsAction);
    }
    
    public final MenuItem setShowAsActionFlags(final int showAsActionFlags) {
        ((MenuItem)this.c).setShowAsActionFlags(showAsActionFlags);
        return (MenuItem)this;
    }
    
    public final MenuItem setTitle(final int title) {
        ((MenuItem)this.c).setTitle(title);
        return (MenuItem)this;
    }
    
    public final MenuItem setTitle(final CharSequence title) {
        ((MenuItem)this.c).setTitle(title);
        return (MenuItem)this;
    }
    
    public final MenuItem setTitleCondensed(final CharSequence titleCondensed) {
        ((MenuItem)this.c).setTitleCondensed(titleCondensed);
        return (MenuItem)this;
    }
    
    public final MenuItem setTooltipText(final CharSequence tooltipText) {
        this.c.setTooltipText(tooltipText);
        return (MenuItem)this;
    }
    
    public final MenuItem setVisible(final boolean visible) {
        return ((MenuItem)this.c).setVisible(visible);
    }
}
