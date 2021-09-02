package defpackage;

/* renamed from: dsp reason: default package */
/* compiled from: PG */
public final class dsp {
    public static final defpackage.dsp a = new defpackage.dsp();
    public final java.util.concurrent.ConcurrentNavigableMap b = new java.util.concurrent.ConcurrentSkipListMap();
    public final java.util.concurrent.ConcurrentMap c = new java.util.concurrent.ConcurrentHashMap();
    public final java.util.concurrent.ConcurrentMap d = new java.util.concurrent.ConcurrentHashMap();

    public dsp() {
        new java.util.concurrent.ConcurrentSkipListMap();
        new java.util.concurrent.ConcurrentHashMap();
    }

    static void a(java.util.Map map, defpackage.dzw dzw) {
        map.put(java.lang.Long.valueOf(dzw.b().a), dzw);
    }

    static void b(java.util.Map map, defpackage.dzw dzw) {
        map.remove(java.lang.Long.valueOf(dzw.b().a));
    }
}
