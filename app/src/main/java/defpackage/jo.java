package defpackage;

/* renamed from: jo reason: default package */
/* compiled from: PG */
public final class jo extends defpackage.je {
    public java.util.ArrayList l;
    public int m;
    public boolean n;
    private boolean o;

    public jo() {
        this.l = new java.util.ArrayList();
        this.o = true;
        this.n = false;
    }

    public final defpackage.jo a(defpackage.je jeVar) {
        this.l.add(jeVar);
        jeVar.g = this;
        if (this.b >= 0) {
            jeVar.a(this.b);
        }
        return this;
    }

    public final defpackage.je a(int i) {
        if (i < 0 || i >= this.l.size()) {
            return null;
        }
        return (defpackage.je) this.l.get(i);
    }

    /* access modifiers changed from: protected */
    public final void a(android.view.ViewGroup viewGroup, defpackage.js jsVar, defpackage.js jsVar2, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        long j = this.a;
        int size = this.l.size();
        for (int i = 0; i < size; i++) {
            defpackage.je jeVar = (defpackage.je) this.l.get(i);
            if (j > 0 && (this.o || i == 0)) {
                long j2 = jeVar.a;
                if (j2 > 0) {
                    jeVar.b(j2 + j);
                } else {
                    jeVar.b(j);
                }
            }
            jeVar.a(viewGroup, jsVar, jsVar2, arrayList, arrayList2);
        }
    }

    /* access modifiers changed from: protected */
    public final void c() {
        if (this.l.isEmpty()) {
            d();
            e();
            return;
        }
        defpackage.jq jqVar = new defpackage.jq(this);
        java.util.ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            java.lang.Object obj = arrayList.get(i);
            i++;
            ((defpackage.je) obj).a((defpackage.ji) jqVar);
        }
        this.m = this.l.size();
        if (!this.o) {
            int i2 = 1;
            while (true) {
                int i3 = i2;
                if (i3 >= this.l.size()) {
                    break;
                }
                ((defpackage.je) this.l.get(i3 - 1)).a((defpackage.ji) new defpackage.jp((defpackage.je) this.l.get(i3)));
                i2 = i3 + 1;
            }
            defpackage.je jeVar = (defpackage.je) this.l.get(0);
            if (jeVar != null) {
                jeVar.c();
                return;
            }
            return;
        }
        java.util.ArrayList arrayList2 = this.l;
        int size2 = arrayList2.size();
        int i4 = 0;
        while (i4 < size2) {
            java.lang.Object obj2 = arrayList2.get(i4);
            i4++;
            ((defpackage.je) obj2).c();
        }
    }

    public final void a(defpackage.jr jrVar) {
        if (a(jrVar.b)) {
            java.util.ArrayList arrayList = this.l;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                java.lang.Object obj = arrayList.get(i);
                i++;
                defpackage.je jeVar = (defpackage.je) obj;
                if (jeVar.a(jrVar.b)) {
                    jeVar.a(jrVar);
                    jrVar.c.add(jeVar);
                }
            }
        }
    }

    public final void b(defpackage.jr jrVar) {
        if (a(jrVar.b)) {
            java.util.ArrayList arrayList = this.l;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                java.lang.Object obj = arrayList.get(i);
                i++;
                defpackage.je jeVar = (defpackage.je) obj;
                if (jeVar.a(jrVar.b)) {
                    jeVar.b(jrVar);
                    jrVar.c.add(jeVar);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void c(defpackage.jr jrVar) {
        super.c(jrVar);
        int size = this.l.size();
        for (int i = 0; i < size; i++) {
            ((defpackage.je) this.l.get(i)).c(jrVar);
        }
    }

    public final void d(android.view.View view) {
        super.d(view);
        int size = this.l.size();
        for (int i = 0; i < size; i++) {
            ((defpackage.je) this.l.get(i)).d(view);
        }
    }

    public final void e(android.view.View view) {
        super.e(view);
        int size = this.l.size();
        for (int i = 0; i < size; i++) {
            ((defpackage.je) this.l.get(i)).e(view);
        }
    }

    public final void a(defpackage.jh jhVar) {
        super.a(jhVar);
        int size = this.l.size();
        for (int i = 0; i < size; i++) {
            ((defpackage.je) this.l.get(i)).a(jhVar);
        }
    }

    /* access modifiers changed from: 0000 */
    public final java.lang.String a(java.lang.String str) {
        java.lang.String a = super.a(str);
        int i = 0;
        while (i < this.l.size()) {
            java.lang.String str2 = a + "\n" + ((defpackage.je) this.l.get(i)).a(str + "  ");
            i++;
            a = str2;
        }
        return a;
    }

    public final defpackage.je f() {
        defpackage.jo joVar = (defpackage.jo) super.clone();
        joVar.l = new java.util.ArrayList();
        int size = this.l.size();
        for (int i = 0; i < size; i++) {
            joVar.a((defpackage.je) ((defpackage.je) this.l.get(i)).clone());
        }
        return joVar;
    }

    public final /* synthetic */ defpackage.je b(defpackage.ji jiVar) {
        return (defpackage.jo) super.b(jiVar);
    }

    public final /* synthetic */ defpackage.je a(defpackage.ji jiVar) {
        return (defpackage.jo) super.a(jiVar);
    }

    public final /* synthetic */ defpackage.je c(android.view.View view) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.l.size()) {
                return (defpackage.jo) super.c(view);
            }
            ((defpackage.je) this.l.get(i2)).c(view);
            i = i2 + 1;
        }
    }

    public final /* synthetic */ defpackage.je b(android.view.View view) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.l.size()) {
                return (defpackage.jo) super.b(view);
            }
            ((defpackage.je) this.l.get(i2)).b(view);
            i = i2 + 1;
        }
    }

    public final /* synthetic */ defpackage.je b(long j) {
        return (defpackage.jo) super.b(j);
    }

    public final /* synthetic */ defpackage.je a(long j) {
        super.a(j);
        if (this.b >= 0) {
            int size = this.l.size();
            for (int i = 0; i < size; i++) {
                ((defpackage.je) this.l.get(i)).a(j);
            }
        }
        return this;
    }

    public final /* synthetic */ java.lang.Object clone() {
        return clone();
    }

    public jo(byte b) {
        this();
        this.o = false;
        a((defpackage.je) new defpackage.iq(2)).a((defpackage.je) new defpackage.ig()).a((defpackage.je) new defpackage.iq(1));
    }
}
