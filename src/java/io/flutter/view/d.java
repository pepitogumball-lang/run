package io.flutter.view;

public enum d
{
    D("TAP", 0, 1), 
    E("LONG_PRESS", 1, 2), 
    F("SCROLL_LEFT", 2, 4), 
    G("SCROLL_RIGHT", 3, 8), 
    H("SCROLL_UP", 4, 16), 
    I("SCROLL_DOWN", 5, 32), 
    J("INCREASE", 6, 64), 
    K("DECREASE", 7, 128), 
    L("SHOW_ON_SCREEN", 8, 256), 
    M("MOVE_CURSOR_FORWARD_BY_CHARACTER", 9, 512), 
    N("MOVE_CURSOR_BACKWARD_BY_CHARACTER", 10, 1024), 
    O("SET_SELECTION", 11, 2048), 
    P("COPY", 12, 4096), 
    Q("CUT", 13, 8192), 
    R("PASTE", 14, 16384), 
    S("DID_GAIN_ACCESSIBILITY_FOCUS", 15, 32768), 
    T("DID_LOSE_ACCESSIBILITY_FOCUS", 16, 65536), 
    U("CUSTOM_ACTION", 17, 131072), 
    V("DISMISS", 18, 262144), 
    W("MOVE_CURSOR_FORWARD_BY_WORD", 19, 524288), 
    X("MOVE_CURSOR_BACKWARD_BY_WORD", 20, 1048576), 
    Y("SET_TEXT", 21, 2097152), 
    Z("EXPAND", 24, 16777216), 
    a0("COLLAPSE", 25, 33554432);
    
    public static final d[] b0;
    public final int C;
    
    public d(final String s, final int n, final int c) {
        this.C = c;
    }
}
