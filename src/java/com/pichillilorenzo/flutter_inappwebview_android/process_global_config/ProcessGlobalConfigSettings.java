package com.pichillilorenzo.flutter_inappwebview_android.process_global_config;

import m0.a;
import java.io.File;
import G0.z;
import F0.d;
import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Map;
import androidx.webkit.ProcessGlobalConfig;
import com.pichillilorenzo.flutter_inappwebview_android.ISettings;

public class ProcessGlobalConfigSettings implements ISettings<ProcessGlobalConfig>
{
    public static final String LOG_TAG = "ProcessGlobalConfigSettings";
    public String dataDirectorySuffix;
    public DirectoryBasePaths directoryBasePaths;
    
    @Override
    public Map<String, Object> getRealSettings(final ProcessGlobalConfig processGlobalConfig) {
        return this.toMap();
    }
    
    @Override
    public ProcessGlobalConfigSettings parse(final Map<String, Object> map) {
        for (final Map$Entry map$Entry : map.entrySet()) {
            final String s = (String)map$Entry.getKey();
            final Object value = map$Entry.getValue();
            if (value == null) {
                continue;
            }
            s.getClass();
            if (!s.equals((Object)"dataDirectorySuffix")) {
                if (!s.equals((Object)"directoryBasePaths")) {
                    continue;
                }
                this.directoryBasePaths = new DirectoryBasePaths().parse((Map<String, Object>)value);
            }
            else {
                this.dataDirectorySuffix = (String)value;
            }
        }
        return this;
    }
    
    @Override
    public Map<String, Object> toMap() {
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"dataDirectorySuffix", (Object)this.dataDirectorySuffix);
        return (Map<String, Object>)hashMap;
    }
    
    public ProcessGlobalConfig toProcessGlobalConfig(final Context context) {
        final Object o = new Object();
        if (this.dataDirectorySuffix != null && d.b(context, "STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX")) {
            final String dataDirectorySuffix = this.dataDirectorySuffix;
            if (!z.B.a(context)) {
                throw z.a();
            }
            if (dataDirectorySuffix.equals((Object)"")) {
                throw new IllegalArgumentException("Suffix cannot be an empty string");
            }
            if (dataDirectorySuffix.indexOf((int)File.separatorChar) >= 0) {
                throw new IllegalArgumentException(a.g("Suffix ", dataDirectorySuffix, " contains a path separator"));
            }
            ((ProcessGlobalConfig)o).a = dataDirectorySuffix;
        }
        if (this.directoryBasePaths != null && d.b(context, "STARTUP_FEATURE_SET_DIRECTORY_BASE_PATHS")) {
            final File file = new File(this.directoryBasePaths.dataDirectoryBasePath);
            final File file2 = new File(this.directoryBasePaths.cacheDirectoryBasePath);
            if (!z.C.a(context)) {
                throw z.a();
            }
            if (!file.isAbsolute()) {
                throw new IllegalArgumentException("dataDirectoryBasePath must be a non-empty absolute path");
            }
            if (!file2.isAbsolute()) {
                throw new IllegalArgumentException("cacheDirectoryBasePath must be a non-empty absolute path");
            }
            ((ProcessGlobalConfig)o).b = file.getAbsolutePath();
            ((ProcessGlobalConfig)o).c = file2.getAbsolutePath();
        }
        return (ProcessGlobalConfig)o;
    }
    
    public static class DirectoryBasePaths implements ISettings<Object>
    {
        public static final String LOG_TAG = "ProcessGlobalConfigSettings";
        public String cacheDirectoryBasePath;
        public String dataDirectoryBasePath;
        
        @Override
        public Map<String, Object> getRealSettings(final Object o) {
            return this.toMap();
        }
        
        @Override
        public DirectoryBasePaths parse(final Map<String, Object> map) {
            for (final Map$Entry map$Entry : map.entrySet()) {
                final String s = (String)map$Entry.getKey();
                final Object value = map$Entry.getValue();
                if (value == null) {
                    continue;
                }
                s.getClass();
                if (!s.equals((Object)"dataDirectoryBasePath")) {
                    if (!s.equals((Object)"cacheDirectoryBasePath")) {
                        continue;
                    }
                    this.cacheDirectoryBasePath = (String)value;
                }
                else {
                    this.dataDirectoryBasePath = (String)value;
                }
            }
            return this;
        }
        
        @Override
        public Map<String, Object> toMap() {
            final HashMap hashMap = new HashMap();
            hashMap.put((Object)"cacheDirectoryBasePath", (Object)this.cacheDirectoryBasePath);
            hashMap.put((Object)"dataDirectoryBasePath", (Object)this.dataDirectoryBasePath);
            return (Map<String, Object>)hashMap;
        }
    }
}
