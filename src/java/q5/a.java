package q5;

import n5.h;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public final class a extends p5.a
{
    @Override
    public final Random a() {
        final ThreadLocalRandom current = ThreadLocalRandom.current();
        h.d("current(...)", current);
        return (Random)current;
    }
}
