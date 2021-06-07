package defpackage;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: cvv  reason: default package */
/* compiled from: PG */
public final class cvv extends cvt {
    private static final Map c;
    private final cue d;

    public static cvv a(int i, cue cue, cuf cuf) {
        if (i >= 10 || !cuf.a()) {
            return new cvv(i, cue, cuf);
        }
        return ((cvv[]) c.get(cue))[i];
    }

    private cvv(int i, cue cue, cuf cuf) {
        super(cuf, i);
        this.d = (cue) cub.a(cue, "format char");
        if (cuf.a()) {
            String str = cue.f;
            return;
        }
        char c2 = cue.c;
        cuf.a(new StringBuilder("%")).append(cuf.b() ? (char) (c2 & 65503) : c2);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.cvt
    public final void a(cvu cvu, Object obj) {
        cvu.a(obj, this.d, this.b);
    }

    static {
        EnumMap enumMap = new EnumMap(cue.class);
        cue[] values = cue.values();
        for (cue cue : values) {
            cvv[] cvvArr = new cvv[10];
            for (int i = 0; i < 10; i++) {
                cvvArr[i] = new cvv(i, cue, cuf.a);
            }
            enumMap.put((Object) cue, (Object) cvvArr);
        }
        c = Collections.unmodifiableMap(enumMap);
    }
}
