package io.flutter.plugin.editing;

import android.view.textservice.SuggestionsInfo;
import java.util.HashMap;
import java.util.ArrayList;
import android.view.textservice.SentenceSuggestionsInfo;
import java.util.Locale;
import android.view.textservice.TextInfo;
import android.os.Bundle;
import G4.a;
import E4.j;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.TextServicesManager;
import b1.f;
import android.view.textservice.SpellCheckerSession$SpellCheckerSessionListener;

public final class g implements SpellCheckerSession$SpellCheckerSessionListener
{
    public final f a;
    public final TextServicesManager b;
    public SpellCheckerSession c;
    public j d;
    
    public g(final TextServicesManager b, final f a) {
        this.b = b;
        this.a = a;
        a.D = this;
    }
    
    public final void a(final String s, final String s2, final j d) {
        if (this.d != null) {
            d.error("error", "Previous spell check request still pending.", (Object)null);
            return;
        }
        this.d = d;
        final Locale a = G4.a.a(s);
        if (this.c == null) {
            this.c = this.b.newSpellCheckerSession((Bundle)null, a, (SpellCheckerSession$SpellCheckerSessionListener)this, true);
        }
        this.c.getSentenceSuggestions(new TextInfo[] { new TextInfo(s2) }, 5);
    }
    
    public final void onGetSentenceSuggestions(final SentenceSuggestionsInfo[] array) {
        if (array.length == 0) {
            this.d.success((Object)new ArrayList());
            this.d = null;
            return;
        }
        final ArrayList list = new ArrayList();
        final SentenceSuggestionsInfo sentenceSuggestionsInfo = array[0];
        if (sentenceSuggestionsInfo == null) {
            this.d.success((Object)new ArrayList());
            this.d = null;
            return;
        }
        for (int i = 0; i < sentenceSuggestionsInfo.getSuggestionsCount(); ++i) {
            final SuggestionsInfo suggestionsInfo = sentenceSuggestionsInfo.getSuggestionsInfoAt(i);
            final int suggestionsCount = suggestionsInfo.getSuggestionsCount();
            if (suggestionsCount > 0) {
                final HashMap hashMap = new HashMap();
                final int offset = sentenceSuggestionsInfo.getOffsetAt(i);
                final int length = sentenceSuggestionsInfo.getLengthAt(i);
                hashMap.put((Object)"startIndex", (Object)offset);
                hashMap.put((Object)"endIndex", (Object)(length + offset));
                final ArrayList list2 = new ArrayList();
                int j = 0;
                boolean b = false;
                while (j < suggestionsCount) {
                    final String suggestion = suggestionsInfo.getSuggestionAt(j);
                    if (!suggestion.equals((Object)"")) {
                        list2.add((Object)suggestion);
                        b = true;
                    }
                    ++j;
                }
                if (b) {
                    hashMap.put((Object)"suggestions", (Object)list2);
                    list.add((Object)hashMap);
                }
            }
        }
        this.d.success((Object)list);
        this.d = null;
    }
    
    public final void onGetSuggestions(final SuggestionsInfo[] array) {
    }
}
