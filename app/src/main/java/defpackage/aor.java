package defpackage;

import com.google.android.apps.tasks.R;

/* renamed from: aor reason: default package */
/* compiled from: PG */
public final class aor extends defpackage.aoq {
    private final defpackage.bhq b;
    private final java.lang.String c;
    private final java.lang.String d;

    public aor(android.content.Context context, android.content.Intent intent) {
        if (defpackage.bhr.a(context, intent)) {
            this.b = defpackage.bhr.b(context, intent);
        } else {
            this.b = null;
        }
        java.lang.String stringExtra = intent.getStringExtra("android.intent.extra.SUBJECT");
        java.lang.String stringExtra2 = intent.getStringExtra("android.intent.extra.TEXT");
        if (defpackage.crx.a(stringExtra)) {
            this.c = stringExtra2;
            this.d = null;
            return;
        }
        this.c = stringExtra;
        this.d = stringExtra2;
    }

    public final java.lang.String a(android.content.Context context) {
        if (this.b != null) {
            return this.b.a;
        }
        return null;
    }

    public final AbsActivityConfig a(android.content.Context context, java.lang.String str) {
        defpackage.dan dan;
        java.lang.String str2;
        defpackage.dih dih;
        defpackage.dih dih2;
        if (this.b != null && !this.b.a.equals(str)) {
            str2 = context.getResources().getString(R.string.invalid_account);
            dan = null;
        } else if (android.text.TextUtils.isEmpty(this.c)) {
            str2 = context.getResources().getString(R.string.invalid_title);
            dan = null;
        } else if (this.d == null || !defpackage.ajd.b(this.d)) {
            dan = null;
            str2 = null;
        } else {
            defpackage.dii a = ((defpackage.dii) defpackage.dan.f.a(defpackage.bg.ao)).a(((defpackage.dii) defpackage.dao.c.a(defpackage.bg.ao)).b(this.c).a(this.d));
            if (a.b) {
                dih = a.a;
            } else {
                defpackage.dih dih3 = a.a;
                defpackage.djz.a.a(dih3).c(dih3);
                a.b = true;
                dih = a.a;
            }
            defpackage.dih dih4 = dih;
            if (!defpackage.dih.a(dih4, true)) {
                throw new defpackage.dkw();
            }
            dan = (defpackage.dan) dih4;
            str2 = null;
        }
        if (str2 == null) {
            java.lang.String a2 = defpackage.ain.b(context, str).a();
            defpackage.dii g = ((defpackage.dii) defpackage.dby.g.a(defpackage.bg.ao)).g(((defpackage.dii) defpackage.dca.g.a(defpackage.bg.ao)).setTitle(this.c));
            if (dan != null) {
                defpackage.dca f = g.f();
                defpackage.dii dii = (defpackage.dii) f.a(defpackage.bg.ao);
                dii.a(f);
                defpackage.dii dii2 = dii;
                dii2.b();
                defpackage.dca dca = (defpackage.dca) dii2.a;
                if (dan == null) {
                    throw new java.lang.NullPointerException();
                }
                dca.f = dan;
                g.g(dii2);
            }
            defpackage.anc c2 = defpackage.any.a().c();
            if (g.b) {
                dih2 = g.a;
            } else {
                defpackage.dih dih5 = g.a;
                defpackage.djz.a.a(dih5).c(dih5);
                g.b = true;
                dih2 = g.a;
            }
            defpackage.dih dih6 = dih2;
            if (!defpackage.dih.a(dih6, true)) {
                throw new defpackage.dkw();
            }
            c2.a(a2, (defpackage.dby) dih6, 0, null);
        } else {
            android.widget.Toast.makeText(context, str2, 0).show();
        }
        return defpackage.aoe.a;
    }
}
