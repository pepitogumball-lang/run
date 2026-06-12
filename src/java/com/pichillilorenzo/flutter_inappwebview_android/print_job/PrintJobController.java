package com.pichillilorenzo.flutter_inappwebview_android.print_job;

import com.pichillilorenzo.flutter_inappwebview_android.types.PrintJobInfoExt;
import F4.p;
import m0.a;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import android.print.PrintJob;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;

public class PrintJobController implements Disposable
{
    protected static final String LOG_TAG = "PrintJob";
    public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappwebview_printjobcontroller_";
    public PrintJobChannelDelegate channelDelegate;
    public String id;
    public PrintJob job;
    public InAppWebViewFlutterPlugin plugin;
    public PrintJobSettings settings;
    
    public PrintJobController(final String id, final PrintJob job, final PrintJobSettings settings, final InAppWebViewFlutterPlugin plugin) {
        this.id = id;
        this.plugin = plugin;
        this.job = job;
        this.settings = settings;
        this.channelDelegate = new PrintJobChannelDelegate(this, new p(plugin.messenger, a.f("com.pichillilorenzo/flutter_inappwebview_printjobcontroller_", id)));
    }
    
    public void cancel() {
        final PrintJob job = this.job;
        if (job != null) {
            job.cancel();
        }
    }
    
    @Override
    public void dispose() {
        final PrintJobChannelDelegate channelDelegate = this.channelDelegate;
        if (channelDelegate != null) {
            channelDelegate.dispose();
            this.channelDelegate = null;
        }
        final InAppWebViewFlutterPlugin plugin = this.plugin;
        if (plugin != null) {
            final PrintJobManager printJobManager = plugin.printJobManager;
            if (printJobManager != null && printJobManager.jobs.containsKey((Object)this.id)) {
                printJobManager.jobs.put((Object)this.id, (Object)null);
            }
        }
        final PrintJob job = this.job;
        if (job != null) {
            job.cancel();
            this.job = null;
        }
        this.plugin = null;
    }
    
    public void disposeNoCancel() {
        final PrintJobChannelDelegate channelDelegate = this.channelDelegate;
        if (channelDelegate != null) {
            channelDelegate.dispose();
            this.channelDelegate = null;
        }
        final InAppWebViewFlutterPlugin plugin = this.plugin;
        if (plugin != null) {
            final PrintJobManager printJobManager = plugin.printJobManager;
            if (printJobManager != null && printJobManager.jobs.containsKey((Object)this.id)) {
                printJobManager.jobs.put((Object)this.id, (Object)null);
            }
        }
        if (this.job != null) {
            this.job = null;
        }
        this.plugin = null;
    }
    
    public PrintJobInfoExt getInfo() {
        final PrintJob job = this.job;
        if (job != null) {
            return PrintJobInfoExt.fromPrintJobInfo(job.getInfo());
        }
        return null;
    }
    
    public void restart() {
        final PrintJob job = this.job;
        if (job != null) {
            job.restart();
        }
    }
}
