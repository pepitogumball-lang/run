package com.pichillilorenzo.flutter_inappwebview_android.find_interaction;

import java.util.HashMap;
import java.util.Map;
import com.pichillilorenzo.flutter_inappwebview_android.ISettings;

public class FindInteractionSettings implements ISettings<FindInteractionController>
{
    public static final String LOG_TAG = "FindInteractionSettings";
    
    @Override
    public Map<String, Object> getRealSettings(final FindInteractionController findInteractionController) {
        return this.toMap();
    }
    
    @Override
    public FindInteractionSettings parse(final Map<String, Object> map) {
        return this;
    }
    
    @Override
    public Map<String, Object> toMap() {
        return (Map<String, Object>)new HashMap();
    }
}
