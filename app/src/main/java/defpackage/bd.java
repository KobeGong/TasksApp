package defpackage;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

@Deprecated
/* renamed from: bd  reason: default package */
/* compiled from: PG */
public final class bd {
    @Deprecated
    public final int a;
    @Deprecated
    private final Set b;
    @Deprecated
    private final boolean c;

    private bd(int i, Set set, boolean z) {
        this.a = i;
        this.b = set;
        this.c = z;
    }

    static bd a(String str) {
        int i;
        String str2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (str.startsWith("integer")) {
            i = bg.c;
        } else if (str.startsWith("decimal")) {
            i = bg.d;
        } else {
            throw new IllegalArgumentException("Samples must start with 'integer' or 'decimal'");
        }
        String[] split = av.b.split(str.substring(7).trim());
        boolean z = false;
        boolean z2 = true;
        for (String str3 : split) {
            if (str3.equals("…") || str3.equals("...")) {
                z = true;
                z2 = false;
            } else if (z) {
                String valueOf = String.valueOf(str3);
                throw new IllegalArgumentException(valueOf.length() != 0 ? "Can only have … at the end of samples: ".concat(valueOf) : new String("Can only have … at the end of samples: "));
            } else {
                String[] split2 = av.c.split(str3);
                switch (split2.length) {
                    case 1:
                        bb bbVar = new bb(split2[0]);
                        a(i, bbVar);
                        linkedHashSet.add(new bc(bbVar, bbVar));
                        continue;
                    case 2:
                        bb bbVar2 = new bb(split2[0]);
                        bb bbVar3 = new bb(split2[1]);
                        a(i, bbVar2);
                        a(i, bbVar3);
                        linkedHashSet.add(new bc(bbVar2, bbVar3));
                        continue;
                    default:
                        String valueOf2 = String.valueOf(str3);
                        if (valueOf2.length() != 0) {
                            str2 = "Ill-formed number range: ".concat(valueOf2);
                        } else {
                            str2 = new String("Ill-formed number range: ");
                        }
                        throw new IllegalArgumentException(str2);
                }
            }
        }
        return new bd(i, Collections.unmodifiableSet(linkedHashSet), z2);
    }

    private static void a(int i, bb bbVar) {
        boolean z;
        boolean z2 = true;
        if (i == bg.c) {
            z = true;
        } else {
            z = false;
        }
        if (bbVar.b != 0) {
            z2 = false;
        }
        if (z != z2) {
            String valueOf = String.valueOf(bbVar);
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 25).append("Ill-formed number range: ").append(valueOf).toString());
        }
    }

    @Deprecated
    public final String toString() {
        StringBuilder append = new StringBuilder("@").append(bg.e[this.a - 1].toLowerCase(Locale.ENGLISH));
        boolean z = true;
        for (bc bcVar : this.b) {
            if (z) {
                z = false;
            } else {
                append.append(",");
            }
            append.append(' ').append(bcVar);
        }
        if (!this.c) {
            append.append(", …");
        }
        return append.toString();
    }
}
