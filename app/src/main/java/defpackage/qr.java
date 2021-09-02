package defpackage;

/* renamed from: qr reason: default package */
/* compiled from: PG */
public class qr extends defpackage.ri implements java.util.Map {
    private defpackage.qz c;

    public qr() {
    }

    public qr(int i) {
        super(i);
    }

    public qr(defpackage.ri riVar) {
        super(riVar);
    }

    private final defpackage.qz a() {
        if (this.c == null) {
            this.c = new defpackage.qs(this);
        }
        return this.c;
    }

    public void putAll(java.util.Map map) {
        a(this.b + map.size());
        for (java.util.Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public java.util.Set entrySet() {
        defpackage.qz a = a();
        if (a.a == null) {
            a.a = new defpackage.rb(a);
        }
        return a.a;
    }

    public java.util.Set keySet() {
        return a().d();
    }

    public java.util.Collection values() {
        defpackage.qz a = a();
        if (a.b == null) {
            a.b = new defpackage.re(a);
        }
        return a.b;
    }
}
