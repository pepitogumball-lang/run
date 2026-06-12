package io.flutter.plugins.firebase.core;

import java.util.Collections;
import I5.d;
import e3.a;
import java.util.List;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;

@Keep
public class FlutterFirebaseCoreRegistrar implements ComponentRegistrar
{
    public List<a> getComponents() {
        return (List<a>)Collections.singletonList((Object)d.c("flutter-fire-core", "3.9.0"));
    }
}
