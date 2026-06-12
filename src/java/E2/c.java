package e2;

import android.app.Fragment;
import android.app.Activity;
import android.content.Context;
import android.app.AlertDialog$Builder;
import h2.A;
import android.app.Dialog;
import android.os.Bundle;
import android.content.DialogInterface;
import android.content.DialogInterface$OnCancelListener;
import android.app.AlertDialog;
import android.app.DialogFragment;

public final class c extends DialogFragment
{
    public AlertDialog C;
    public DialogInterface$OnCancelListener D;
    public AlertDialog E;
    
    public final void onCancel(final DialogInterface dialogInterface) {
        final DialogInterface$OnCancelListener d = this.D;
        if (d != null) {
            d.onCancel(dialogInterface);
        }
    }
    
    public final Dialog onCreateDialog(final Bundle bundle) {
        AlertDialog alertDialog;
        if ((alertDialog = this.C) == null) {
            this.setShowsDialog(false);
            if (this.E == null) {
                final Activity activity = ((Fragment)this).getActivity();
                A.h((Object)activity);
                this.E = new AlertDialog$Builder((Context)activity).create();
            }
            alertDialog = this.E;
        }
        return (Dialog)alertDialog;
    }
}
