package com.pichillilorenzo.flutter_inappwebview_android.print_job;

import java.util.Iterator;
import java.util.HashMap;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import java.util.Map;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;

public class PrintJobManager implements Disposable
{
    protected static final String LOG_TAG = "PrintJobManager";
    public final Map<String, PrintJobController> jobs;
    public InAppWebViewFlutterPlugin plugin;
    
    public PrintJobManager(final InAppWebViewFlutterPlugin plugin) {
        this.jobs = (Map<String, PrintJobController>)new HashMap();
        this.plugin = plugin;
    }
    
    @Override
    public void dispose() {
        for (final PrintJobController printJobController : this.jobs.values()) {
            if (printJobController != null) {
                printJobController.dispose();
            }
        }
        this.jobs.clear();
        this.plugin = null;
    }
}
