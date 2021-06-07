package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* renamed from: dsp  reason: default package */
/* compiled from: PG */
public final class dsp {
    public static final dsp a = new dsp();
    public final ConcurrentNavigableMap b = new ConcurrentSkipListMap();
    public final ConcurrentMap c = new ConcurrentHashMap();
    public final ConcurrentMap d = new ConcurrentHashMap();

    public dsp() {
        new ConcurrentSkipListMap();
        new ConcurrentHashMap();
    }

    static void a(Map map, dzw dzw) {
        map.put(Long.valueOf(dzw.b().a), dzw);
    }

    static void b(Map map, dzw dzw) {
        map.remove(Long.valueOf(dzw.b().a));
    }
}
