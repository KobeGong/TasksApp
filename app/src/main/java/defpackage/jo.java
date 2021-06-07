package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: jo  reason: default package */
/* compiled from: PG */
public final class jo extends je {
    public ArrayList l;
    public int m;
    public boolean n;
    private boolean o;

    public jo() {
        this.l = new ArrayList();
        this.o = true;
        this.n = false;
    }

    public final jo a(je jeVar) {
        this.l.add(jeVar);
        jeVar.g = this;
        if (this.b >= 0) {
            jeVar.a(this.b);
        }
        return this;
    }

    public final je a(int i) {
        if (i < 0 || i >= this.l.size()) {
            return null;
        }
        return (je) this.l.get(i);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.je
    public final void a(ViewGroup viewGroup, js jsVar, js jsVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.a;
        int size = this.l.size();
        for (int i = 0; i < size; i++) {
            je jeVar = (je) this.l.get(i);
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
    @Override // defpackage.je
    public final void c() {
        if (this.l.isEmpty()) {
            d();
            e();
            return;
        }
        jq jqVar = new jq(this);
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((je) obj).a(jqVar);
        }
        this.m = this.l.size();
        if (!this.o) {
            for (int i2 = 1; i2 < this.l.size(); i2++) {
                ((je) this.l.get(i2 - 1)).a(new jp((je) this.l.get(i2)));
            }
            je jeVar = (je) this.l.get(0);
            if (jeVar != null) {
                jeVar.c();
                return;
            }
            return;
        }
        ArrayList arrayList2 = this.l;
        int size2 = arrayList2.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            ((je) obj2).c();
        }
    }

    @Override // defpackage.je
    public final void a(jr jrVar) {
        if (a(jrVar.b)) {
            ArrayList arrayList = this.l;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                je jeVar = (je) obj;
                if (jeVar.a(jrVar.b)) {
                    jeVar.a(jrVar);
                    jrVar.c.add(jeVar);
                }
            }
        }
    }

    @Override // defpackage.je
    public final void b(jr jrVar) {
        if (a(jrVar.b)) {
            ArrayList arrayList = this.l;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                je jeVar = (je) obj;
                if (jeVar.a(jrVar.b)) {
                    jeVar.b(jrVar);
                    jrVar.c.add(jeVar);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.je
    public final void c(jr jrVar) {
        super.c(jrVar);
        int size = this.l.size();
        for (int i = 0; i < size; i++) {
            ((je) this.l.get(i)).c(jrVar);
        }
    }

    @Override // defpackage.je
    public final void d(View view) {
        super.d(view);
        int size = this.l.size();
        for (int i = 0; i < size; i++) {
            ((je) this.l.get(i)).d(view);
        }
    }

    @Override // defpackage.je
    public final void e(View view) {
        super.e(view);
        int size = this.l.size();
        for (int i = 0; i < size; i++) {
            ((je) this.l.get(i)).e(view);
        }
    }

    @Override // defpackage.je
    public final void a(jh jhVar) {
        super.a(jhVar);
        int size = this.l.size();
        for (int i = 0; i < size; i++) {
            ((je) this.l.get(i)).a(jhVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.je
    public final String a(String str) {
        String a = super.a(str);
        int i = 0;
        while (i < this.l.size()) {
            String str2 = a + "\n" + ((je) this.l.get(i)).a(str + "  ");
            i++;
            a = str2;
        }
        return a;
    }

    @Override // defpackage.je
    public final je f() {
        jo joVar = (jo) super.clone();
        joVar.l = new ArrayList();
        int size = this.l.size();
        for (int i = 0; i < size; i++) {
            joVar.a((je) ((je) this.l.get(i)).clone());
        }
        return joVar;
    }

    @Override // defpackage.je
    public final /* synthetic */ je b(ji jiVar) {
        return (jo) super.b(jiVar);
    }

    @Override // defpackage.je
    public final /* synthetic */ je a(ji jiVar) {
        return (jo) super.a(jiVar);
    }

    @Override // defpackage.je
    public final /* synthetic */ je c(View view) {
        for (int i = 0; i < this.l.size(); i++) {
            ((je) this.l.get(i)).c(view);
        }
        return (jo) super.c(view);
    }

    @Override // defpackage.je
    public final /* synthetic */ je b(View view) {
        for (int i = 0; i < this.l.size(); i++) {
            ((je) this.l.get(i)).b(view);
        }
        return (jo) super.b(view);
    }

    @Override // defpackage.je
    public final /* synthetic */ je b(long j) {
        return (jo) super.b(j);
    }

    @Override // defpackage.je
    public final /* synthetic */ je a(long j) {
        super.a(j);
        if (this.b >= 0) {
            int size = this.l.size();
            for (int i = 0; i < size; i++) {
                ((je) this.l.get(i)).a(j);
            }
        }
        return this;
    }

    @Override // java.lang.Object, defpackage.je
    public final /* synthetic */ Object clone() {
        return clone();
    }

    public jo(byte b) {
        this();
        this.o = false;
        a(new iq(2)).a(new ig()).a(new iq(1));
    }
}
