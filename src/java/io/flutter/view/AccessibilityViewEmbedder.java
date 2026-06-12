package io.flutter.view;

import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import android.os.Bundle;
import android.view.MotionEvent$PointerCoords;
import android.view.MotionEvent$PointerProperties;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityRecord;
import android.os.Parcel;
import io.flutter.plugin.editing.i;
import android.os.Build$VERSION;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.HashMap;
import android.util.SparseArray;
import android.graphics.Rect;
import android.view.View;
import java.util.Map;
import androidx.annotation.Keep;

@Keep
class AccessibilityViewEmbedder
{
    private static final String TAG = "AccessibilityBridge";
    private final Map<View, Rect> embeddedViewToDisplayBounds;
    private final SparseArray<l> flutterIdToOrigin;
    private int nextFlutterId;
    private final Map<l, Integer> originToFlutterId;
    private final k reflectionAccessors;
    private final View rootAccessibilityView;
    
    public AccessibilityViewEmbedder(final View rootAccessibilityView, final int nextFlutterId) {
        this.reflectionAccessors = new k();
        this.flutterIdToOrigin = (SparseArray<l>)new SparseArray();
        this.rootAccessibilityView = rootAccessibilityView;
        this.nextFlutterId = nextFlutterId;
        this.originToFlutterId = (Map<l, Integer>)new HashMap();
        this.embeddedViewToDisplayBounds = (Map<View, Rect>)new HashMap();
    }
    
    private void addChildrenToFlutterNode(final AccessibilityNodeInfo accessibilityNodeInfo, final View view, final AccessibilityNodeInfo accessibilityNodeInfo2) {
        for (int i = 0; i < accessibilityNodeInfo.getChildCount(); ++i) {
            final k reflectionAccessors = this.reflectionAccessors;
            final Method f = reflectionAccessors.f;
            final Long n = null;
            final Field e = reflectionAccessors.e;
            final Method d = reflectionAccessors.d;
            Long n2 = null;
            Label_0226: {
                if (d == null) {
                    n2 = n;
                    if (e == null) {
                        break Label_0226;
                    }
                    if (f == null) {
                        n2 = n;
                        break Label_0226;
                    }
                }
                Label_0126: {
                    Label_0096: {
                        if (d == null) {
                            Label_0212: {
                                try {
                                    n2 = (Long)f.invoke(e.get((Object)accessibilityNodeInfo), new Object[] { i });
                                    n2.getClass();
                                    break Label_0096;
                                }
                                catch (final ArrayIndexOutOfBoundsException ex) {}
                                catch (final InvocationTargetException ex) {}
                                catch (final IllegalAccessException ex2) {
                                    break Label_0212;
                                }
                                final ArrayIndexOutOfBoundsException ex;
                                Log.w("AccessibilityBridge", "The longArrayGetIndex method threw an exception when invoked.", (Throwable)ex);
                                n2 = n;
                                break Label_0226;
                            }
                            final IllegalAccessException ex2;
                            Log.w("AccessibilityBridge", "Failed to access longArrayGetIndex method or the childNodeId field.", (Throwable)ex2);
                            n2 = n;
                            break Label_0226;
                        }
                        try {
                            n2 = (Long)d.invoke((Object)accessibilityNodeInfo, new Object[] { i });
                            break Label_0226;
                        }
                        catch (final InvocationTargetException ex3) {}
                        catch (final IllegalAccessException ex4) {
                            break Label_0126;
                        }
                    }
                    final InvocationTargetException ex3;
                    Log.w("AccessibilityBridge", "The getChildId method threw an exception when invoked.", (Throwable)ex3);
                    n2 = n;
                    break Label_0226;
                }
                final IllegalAccessException ex4;
                Log.w("AccessibilityBridge", "Failed to access getChildId method.", (Throwable)ex4);
                n2 = n;
            }
            if (n2 != null) {
                final int n3 = (int)((long)n2 >> 32);
                final l l = new l(view, n3);
                int intValue;
                if (this.originToFlutterId.containsKey((Object)l)) {
                    intValue = (int)this.originToFlutterId.get((Object)l);
                }
                else {
                    intValue = this.nextFlutterId++;
                    this.cacheVirtualIdMappings(view, n3, intValue);
                }
                accessibilityNodeInfo2.addChild(this.rootAccessibilityView, intValue);
            }
        }
    }
    
    private void cacheVirtualIdMappings(final View view, final int n, final int n2) {
        final l l = new l(view, n);
        this.originToFlutterId.put((Object)l, (Object)n2);
        this.flutterIdToOrigin.put(n2, (Object)l);
    }
    
    private AccessibilityNodeInfo convertToFlutterNode(final AccessibilityNodeInfo accessibilityNodeInfo, final int n, final View view) {
        final AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.rootAccessibilityView, n);
        obtain.setPackageName((CharSequence)this.rootAccessibilityView.getContext().getPackageName());
        obtain.setSource(this.rootAccessibilityView, n);
        obtain.setClassName(accessibilityNodeInfo.getClassName());
        final Rect rect = (Rect)this.embeddedViewToDisplayBounds.get((Object)view);
        this.copyAccessibilityFields(accessibilityNodeInfo, obtain);
        this.setFlutterNodesTranslateBounds(accessibilityNodeInfo, rect, obtain);
        this.addChildrenToFlutterNode(accessibilityNodeInfo, view, obtain);
        this.setFlutterNodeParent(accessibilityNodeInfo, view, obtain);
        return obtain;
    }
    
    private void copyAccessibilityFields(final AccessibilityNodeInfo accessibilityNodeInfo, final AccessibilityNodeInfo accessibilityNodeInfo2) {
        accessibilityNodeInfo2.setAccessibilityFocused(accessibilityNodeInfo.isAccessibilityFocused());
        accessibilityNodeInfo2.setCheckable(accessibilityNodeInfo.isCheckable());
        accessibilityNodeInfo2.setChecked(accessibilityNodeInfo.isChecked());
        accessibilityNodeInfo2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityNodeInfo2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityNodeInfo2.setClickable(accessibilityNodeInfo.isClickable());
        accessibilityNodeInfo2.setFocusable(accessibilityNodeInfo.isFocusable());
        accessibilityNodeInfo2.setFocused(accessibilityNodeInfo.isFocused());
        accessibilityNodeInfo2.setLongClickable(accessibilityNodeInfo.isLongClickable());
        accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo.getMovementGranularities());
        accessibilityNodeInfo2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityNodeInfo2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityNodeInfo2.setSelected(accessibilityNodeInfo.isSelected());
        accessibilityNodeInfo2.setText(accessibilityNodeInfo.getText());
        accessibilityNodeInfo2.setVisibleToUser(accessibilityNodeInfo.isVisibleToUser());
        accessibilityNodeInfo2.setEditable(accessibilityNodeInfo.isEditable());
        accessibilityNodeInfo2.setCanOpenPopup(accessibilityNodeInfo.canOpenPopup());
        accessibilityNodeInfo2.setCollectionInfo(accessibilityNodeInfo.getCollectionInfo());
        accessibilityNodeInfo2.setCollectionItemInfo(accessibilityNodeInfo.getCollectionItemInfo());
        accessibilityNodeInfo2.setContentInvalid(accessibilityNodeInfo.isContentInvalid());
        accessibilityNodeInfo2.setDismissable(accessibilityNodeInfo.isDismissable());
        accessibilityNodeInfo2.setInputType(accessibilityNodeInfo.getInputType());
        accessibilityNodeInfo2.setLiveRegion(accessibilityNodeInfo.getLiveRegion());
        accessibilityNodeInfo2.setMultiLine(accessibilityNodeInfo.isMultiLine());
        accessibilityNodeInfo2.setRangeInfo(accessibilityNodeInfo.getRangeInfo());
        accessibilityNodeInfo2.setError(accessibilityNodeInfo.getError());
        accessibilityNodeInfo2.setMaxTextLength(accessibilityNodeInfo.getMaxTextLength());
        final int sdk_INT = Build$VERSION.SDK_INT;
        accessibilityNodeInfo2.setContextClickable(accessibilityNodeInfo.isContextClickable());
        accessibilityNodeInfo2.setDrawingOrder(accessibilityNodeInfo.getDrawingOrder());
        accessibilityNodeInfo2.setImportantForAccessibility(accessibilityNodeInfo.isImportantForAccessibility());
        if (sdk_INT >= 26) {
            i.m(accessibilityNodeInfo2, i.i(accessibilityNodeInfo));
            i.l(accessibilityNodeInfo2, i.f(accessibilityNodeInfo));
            i.n(accessibilityNodeInfo2, i.v(accessibilityNodeInfo));
        }
    }
    
    private void setFlutterNodeParent(AccessibilityNodeInfo accessibilityNodeInfo, final View view, final AccessibilityNodeInfo accessibilityNodeInfo2) {
        final Method b = this.reflectionAccessors.b;
        final AccessibilityNodeInfo accessibilityNodeInfo3 = null;
        final AccessibilityNodeInfo accessibilityNodeInfo4 = null;
        Label_0209: {
            Label_0079: {
                if (b != null) {
                    Label_0068: {
                        try {
                            final Object o = b.invoke((Object)accessibilityNodeInfo, (Object[])null);
                            ((Long)o).getClass();
                            accessibilityNodeInfo = (AccessibilityNodeInfo)o;
                            break Label_0209;
                        }
                        catch (final InvocationTargetException ex) {}
                        catch (final IllegalAccessException ex2) {
                            break Label_0068;
                        }
                        final InvocationTargetException ex;
                        Log.w("AccessibilityBridge", "The getParentNodeId method threw an exception when invoked.", (Throwable)ex);
                        break Label_0079;
                    }
                    final IllegalAccessException ex2;
                    Log.w("AccessibilityBridge", "Failed to access getParentNodeId method.", (Throwable)ex2);
                }
            }
            if (Build$VERSION.SDK_INT < 26) {
                Log.w("AccessibilityBridge", "Unexpected Android version. Unable to find the parent ID.");
                accessibilityNodeInfo = accessibilityNodeInfo3;
            }
            else {
                accessibilityNodeInfo = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
                final Parcel obtain = Parcel.obtain();
                obtain.setDataPosition(0);
                accessibilityNodeInfo.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                final long long1 = obtain.readLong();
                if (k.b(long1, 0)) {
                    obtain.readInt();
                }
                if (k.b(long1, 1)) {
                    obtain.readLong();
                }
                if (k.b(long1, 2)) {
                    obtain.readInt();
                }
                accessibilityNodeInfo = accessibilityNodeInfo4;
                if (k.b(long1, 3)) {
                    accessibilityNodeInfo = (AccessibilityNodeInfo)Long.valueOf(obtain.readLong());
                }
                obtain.recycle();
            }
        }
        if (accessibilityNodeInfo == null) {
            return;
        }
        final Integer n = (Integer)this.originToFlutterId.get((Object)new l(view, (int)((long)accessibilityNodeInfo >> 32)));
        if (n != null) {
            accessibilityNodeInfo2.setParent(this.rootAccessibilityView, (int)n);
        }
    }
    
    private void setFlutterNodesTranslateBounds(final AccessibilityNodeInfo accessibilityNodeInfo, final Rect rect, final AccessibilityNodeInfo accessibilityNodeInfo2) {
        final Rect boundsInParent = new Rect();
        accessibilityNodeInfo.getBoundsInParent(boundsInParent);
        accessibilityNodeInfo2.setBoundsInParent(boundsInParent);
        final Rect boundsInScreen = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(boundsInScreen);
        boundsInScreen.offset(rect.left, rect.top);
        accessibilityNodeInfo2.setBoundsInScreen(boundsInScreen);
    }
    
    public AccessibilityNodeInfo createAccessibilityNodeInfo(final int n) {
        final l l = (l)this.flutterIdToOrigin.get(n);
        if (l == null) {
            return null;
        }
        final Map<View, Rect> embeddedViewToDisplayBounds = this.embeddedViewToDisplayBounds;
        final View a = l.a;
        if (!embeddedViewToDisplayBounds.containsKey((Object)a)) {
            return null;
        }
        if (a.getAccessibilityNodeProvider() == null) {
            return null;
        }
        final AccessibilityNodeInfo accessibilityNodeInfo = a.getAccessibilityNodeProvider().createAccessibilityNodeInfo(l.b);
        if (accessibilityNodeInfo == null) {
            return null;
        }
        return this.convertToFlutterNode(accessibilityNodeInfo, n, a);
    }
    
    public Integer getRecordFlutterId(final View view, final AccessibilityRecord accessibilityRecord) {
        final Long a = k.a(this.reflectionAccessors, accessibilityRecord);
        if (a == null) {
            return null;
        }
        return (Integer)this.originToFlutterId.get((Object)new l(view, (int)((long)a >> 32)));
    }
    
    public AccessibilityNodeInfo getRootNode(final View view, final int n, final Rect rect) {
        final AccessibilityNodeInfo accessibilityNodeInfo = view.createAccessibilityNodeInfo();
        final Method a = this.reflectionAccessors.a;
        Long n2 = null;
        Label_0080: {
            Label_0020: {
                if (a != null) {
                    Label_0066: {
                        try {
                            n2 = (Long)a.invoke((Object)accessibilityNodeInfo, (Object[])null);
                            break Label_0080;
                        }
                        catch (final InvocationTargetException ex) {}
                        catch (final IllegalAccessException ex2) {
                            break Label_0066;
                        }
                        final InvocationTargetException ex;
                        Log.w("AccessibilityBridge", "The getSourceNodeId method threw an exception when invoked.", (Throwable)ex);
                        break Label_0020;
                    }
                    final IllegalAccessException ex2;
                    Log.w("AccessibilityBridge", "Failed to access getSourceNodeId method.", (Throwable)ex2);
                }
            }
            n2 = null;
        }
        if (n2 == null) {
            return null;
        }
        this.embeddedViewToDisplayBounds.put((Object)view, (Object)rect);
        this.cacheVirtualIdMappings(view, (int)((long)n2 >> 32), n);
        return this.convertToFlutterNode(accessibilityNodeInfo, n, view);
    }
    
    public boolean onAccessibilityHoverEvent(int i, final MotionEvent motionEvent) {
        final l l = (l)this.flutterIdToOrigin.get(i);
        i = 0;
        if (l == null) {
            return false;
        }
        final Map<View, Rect> embeddedViewToDisplayBounds = this.embeddedViewToDisplayBounds;
        final View a = l.a;
        final Rect rect = (Rect)embeddedViewToDisplayBounds.get((Object)a);
        final int pointerCount = motionEvent.getPointerCount();
        final MotionEvent$PointerProperties[] array = new MotionEvent$PointerProperties[pointerCount];
        final MotionEvent$PointerCoords[] array2 = new MotionEvent$PointerCoords[pointerCount];
        while (i < motionEvent.getPointerCount()) {
            motionEvent.getPointerProperties(i, array[i] = new MotionEvent$PointerProperties());
            final MotionEvent$PointerCoords motionEvent$PointerCoords = new MotionEvent$PointerCoords();
            motionEvent.getPointerCoords(i, motionEvent$PointerCoords);
            final MotionEvent$PointerCoords motionEvent$PointerCoords2 = new MotionEvent$PointerCoords(motionEvent$PointerCoords);
            array2[i] = motionEvent$PointerCoords2;
            motionEvent$PointerCoords2.x -= rect.left;
            motionEvent$PointerCoords2.y -= rect.top;
            ++i;
        }
        return a.dispatchGenericMotionEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getPointerCount(), array, array2, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags()));
    }
    
    public boolean performAction(final int n, final int n2, final Bundle bundle) {
        final l l = (l)this.flutterIdToOrigin.get(n);
        if (l == null) {
            return false;
        }
        final AccessibilityNodeProvider accessibilityNodeProvider = l.a.getAccessibilityNodeProvider();
        return accessibilityNodeProvider != null && accessibilityNodeProvider.performAction(l.b, n2, bundle);
    }
    
    public View platformViewOfNode(final int n) {
        final l l = (l)this.flutterIdToOrigin.get(n);
        if (l == null) {
            return null;
        }
        return l.a;
    }
    
    public boolean requestSendAccessibilityEvent(final View view, final View view2, final AccessibilityEvent accessibilityEvent) {
        final AccessibilityEvent obtain = AccessibilityEvent.obtain(accessibilityEvent);
        final Long a = k.a(this.reflectionAccessors, (AccessibilityRecord)accessibilityEvent);
        if (a == null) {
            return false;
        }
        final int n = (int)((long)a >> 32);
        Integer value;
        if ((value = (Integer)this.originToFlutterId.get((Object)new l(view, n))) == null) {
            final int n2 = this.nextFlutterId++;
            this.cacheVirtualIdMappings(view, n, n2);
            value = n2;
        }
        ((AccessibilityRecord)obtain).setSource(this.rootAccessibilityView, (int)value);
        ((AccessibilityRecord)obtain).setClassName(((AccessibilityRecord)accessibilityEvent).getClassName());
        obtain.setPackageName(accessibilityEvent.getPackageName());
        for (int i = 0; i < obtain.getRecordCount(); ++i) {
            final AccessibilityRecord record = obtain.getRecord(i);
            final Long a2 = k.a(this.reflectionAccessors, record);
            if (a2 == null) {
                return false;
            }
            final l l = new l(view, (int)((long)a2 >> 32));
            if (!this.originToFlutterId.containsKey((Object)l)) {
                return false;
            }
            record.setSource(this.rootAccessibilityView, (int)this.originToFlutterId.get((Object)l));
        }
        return this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(view2, obtain);
    }
}
