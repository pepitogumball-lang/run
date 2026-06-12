package t0;

public final class z
{
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    
    public final int a() {
        final boolean c = this.c;
        int n = 0;
        if (c) {
            n = 0 - this.a;
        }
        return n;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("State{mTargetPosition=-1, mData=null, mItemCount=0, mIsMeasuring=false, mPreviousLayoutItemCount=0, mDeletedInvisibleItemCountSincePreviousLayout=");
        sb.append(this.a);
        sb.append(", mStructureChanged=");
        sb.append(this.b);
        sb.append(", mInPreLayout=");
        sb.append(this.c);
        sb.append(", mRunSimpleAnimations=");
        sb.append(this.d);
        sb.append(", mRunPredictiveAnimations=");
        sb.append(this.e);
        sb.append('}');
        return sb.toString();
    }
}
