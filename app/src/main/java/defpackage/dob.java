package defpackage;

/* renamed from: dob reason: default package */
/* compiled from: PG */
public final class dob {
    public static final defpackage.dob a = new defpackage.dob().a(new defpackage.dnn(), true).a(defpackage.dno.a, false);
    private static final defpackage.crr d = new defpackage.crr(",");
    public final java.util.Map b;
    public final byte[] c;

    private final defpackage.dob a(defpackage.doa doa, boolean z) {
        return new defpackage.dob(doa, z, this);
    }

    private dob(defpackage.doa doa, boolean z, defpackage.dob dob) {
        java.lang.String a2 = doa.a();
        defpackage.cld.a(!a2.contains(","), (java.lang.Object) "Comma is currently not allowed in message encoding");
        int size = dob.b.size();
        if (!dob.b.containsKey(doa.a())) {
            size++;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(size);
        for (defpackage.doc doc : dob.b.values()) {
            java.lang.String a3 = doc.a.a();
            if (!a3.equals(a2)) {
                linkedHashMap.put(a3, new defpackage.doc(doc.a, doc.b));
            }
        }
        linkedHashMap.put(a2, new defpackage.doc(doa, z));
        this.b = java.util.Collections.unmodifiableMap(linkedHashMap);
        defpackage.crr crr = d;
        java.util.HashSet hashSet = new java.util.HashSet(this.b.size());
        for (java.util.Map.Entry entry : this.b.entrySet()) {
            if (((defpackage.doc) entry.getValue()).b) {
                hashSet.add((java.lang.String) entry.getKey());
            }
        }
        this.c = crr.a(new java.lang.StringBuilder(), java.util.Collections.unmodifiableSet(hashSet).iterator()).toString().getBytes(java.nio.charset.Charset.forName("US-ASCII"));
    }

    private dob() {
        this.b = new java.util.LinkedHashMap(0);
        this.c = new byte[0];
    }
}
