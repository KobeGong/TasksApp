package defpackage;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: dob  reason: default package */
/* compiled from: PG */
public final class dob {
    public static final dob a = new dob().a(new dnn(), true).a(dno.a, false);
    private static final crr d = new crr(",");
    public final Map b;
    public final byte[] c;

    private final dob a(doa doa, boolean z) {
        return new dob(doa, z, this);
    }

    private dob(doa doa, boolean z, dob dob) {
        String a2 = doa.a();
        cld.a(!a2.contains(","), "Comma is currently not allowed in message encoding");
        int size = dob.b.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(!dob.b.containsKey(doa.a()) ? size + 1 : size);
        for (doc doc : dob.b.values()) {
            String a3 = doc.a.a();
            if (!a3.equals(a2)) {
                linkedHashMap.put(a3, new doc(doc.a, doc.b));
            }
        }
        linkedHashMap.put(a2, new doc(doa, z));
        this.b = Collections.unmodifiableMap(linkedHashMap);
        crr crr = d;
        HashSet hashSet = new HashSet(this.b.size());
        for (Map.Entry entry : this.b.entrySet()) {
            if (((doc) entry.getValue()).b) {
                hashSet.add((String) entry.getKey());
            }
        }
        this.c = crr.a(new StringBuilder(), Collections.unmodifiableSet(hashSet).iterator()).toString().getBytes(Charset.forName("US-ASCII"));
    }

    private dob() {
        this.b = new LinkedHashMap(0);
        this.c = new byte[0];
    }
}
