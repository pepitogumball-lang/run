package S;

import android.os.BaseBundle;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import E4.b;
import android.view.inputmethod.InputConnectionWrapper;

public final class e extends InputConnectionWrapper
{
    public final b a;
    
    public e(final InputConnection inputConnection, final b a) {
        this.a = a;
        super(inputConnection, false);
    }
    
    public final boolean performPrivateCommand(final String s, final Bundle bundle) {
        final b a = this.a;
        int n = 0;
        final int n2 = 0;
        if (bundle != null) {
            boolean b;
            if (TextUtils.equals((CharSequence)"androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", (CharSequence)s)) {
                b = false;
            }
            else {
                if (!TextUtils.equals((CharSequence)"android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", (CharSequence)s)) {
                    return n != 0 || super.performPrivateCommand(s, bundle);
                }
                b = true;
            }
            String s2;
            if (b) {
                s2 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
            }
            else {
                s2 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
            }
            final ResultReceiver resultReceiver = (ResultReceiver)bundle.getParcelable(s2);
            String s3;
            if (b) {
                s3 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
            }
            else {
                s3 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
            }
            final Uri uri = (Uri)bundle.getParcelable(s3);
            String s4;
            if (b) {
                s4 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
            }
            else {
                s4 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
            }
            final ClipDescription clipDescription = (ClipDescription)bundle.getParcelable(s4);
            String s5;
            if (b) {
                s5 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
            }
            else {
                s5 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
            }
            final Uri uri2 = (Uri)bundle.getParcelable(s5);
            String s6;
            if (b) {
                s6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
            }
            else {
                s6 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
            }
            final int int1 = ((BaseBundle)bundle).getInt(s6);
            String s7;
            if (b) {
                s7 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
            }
            else {
                s7 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
            }
            final Bundle bundle2 = (Bundle)bundle.getParcelable(s7);
            int h = n2;
            if (uri != null) {
                h = n2;
                if (clipDescription != null) {
                    h = (a.h(new C2.b(uri, clipDescription, uri2), int1, bundle2) ? 1 : 0);
                }
            }
            n = h;
            if (resultReceiver != null) {
                resultReceiver.send(h, (Bundle)null);
                n = h;
            }
        }
        return n != 0 || super.performPrivateCommand(s, bundle);
        final ResultReceiver resultReceiver2;
        iftrue(Label_0285:)(resultReceiver2 == null);
        resultReceiver2.send(0, (Bundle)null);
        Label_0285: {
            throw;
        }
    }
}
