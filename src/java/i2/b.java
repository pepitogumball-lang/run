package i2;

import android.os.Parcel;

public final class b extends RuntimeException
{
    public b(final String s, final Parcel parcel) {
        final int dataPosition = parcel.dataPosition();
        final int dataSize = parcel.dataSize();
        final StringBuilder sb = new StringBuilder(String.valueOf((Object)s).length() + 13 + String.valueOf(dataPosition).length() + 6 + String.valueOf(dataSize).length());
        sb.append(s);
        sb.append(" Parcel: pos=");
        sb.append(dataPosition);
        sb.append(" size=");
        sb.append(dataSize);
        super(sb.toString());
    }
}
