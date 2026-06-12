package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.HashMap;
import java.util.Map;
import android.print.PrintJobInfo;

public class PrintJobInfoExt
{
    private PrintAttributesExt attributes;
    private int copies;
    private long creationTime;
    private String label;
    private Integer numberOfPages;
    private String printerId;
    private int state;
    
    public static PrintJobInfoExt fromPrintJobInfo(final PrintJobInfo printJobInfo) {
        final String s = null;
        if (printJobInfo == null) {
            return null;
        }
        final PrintJobInfoExt printJobInfoExt = new PrintJobInfoExt();
        printJobInfoExt.state = printJobInfo.getState();
        printJobInfoExt.copies = printJobInfo.getCopies();
        Integer value;
        if (printJobInfo.getPages() != null) {
            value = printJobInfo.getPages().length;
        }
        else {
            value = null;
        }
        printJobInfoExt.numberOfPages = value;
        printJobInfoExt.creationTime = printJobInfo.getCreationTime();
        printJobInfoExt.label = printJobInfo.getLabel();
        String localId = s;
        if (printJobInfo.getPrinterId() != null) {
            localId = printJobInfo.getPrinterId().getLocalId();
        }
        printJobInfoExt.printerId = localId;
        printJobInfoExt.attributes = PrintAttributesExt.fromPrintAttributes(printJobInfo.getAttributes());
        return printJobInfoExt;
    }
    
    public Map<String, Object> toMap() {
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"state", (Object)this.state);
        hashMap.put((Object)"copies", (Object)this.copies);
        hashMap.put((Object)"numberOfPages", (Object)this.numberOfPages);
        hashMap.put((Object)"creationTime", (Object)this.creationTime);
        hashMap.put((Object)"label", (Object)this.label);
        final HashMap hashMap2 = new HashMap();
        hashMap2.put((Object)"id", (Object)this.printerId);
        hashMap.put((Object)"printer", (Object)hashMap2);
        final PrintAttributesExt attributes = this.attributes;
        Map map;
        if (attributes != null) {
            map = attributes.toMap();
        }
        else {
            map = null;
        }
        hashMap.put((Object)"attributes", (Object)map);
        return (Map<String, Object>)hashMap;
    }
}
