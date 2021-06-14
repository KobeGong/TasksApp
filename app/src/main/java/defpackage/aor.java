package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.Toast;
import com.google.android.apps.tasks.R;

/* renamed from: aor  reason: default package */
/* compiled from: PG */
public final class aor extends aoq {
    private final bhq b;
    private final String c;
    private final String d;

    public aor(Context context, Intent intent) {
        if (bhr.a(context, intent)) {
            this.b = bhr.b(context, intent);
        } else {
            this.b = null;
        }
        String stringExtra = intent.getStringExtra("android.intent.extra.SUBJECT");
        String stringExtra2 = intent.getStringExtra("android.intent.extra.TEXT");
        if (crx.a(stringExtra)) {
            this.c = stringExtra2;
            this.d = null;
            return;
        }
        this.c = stringExtra;
        this.d = stringExtra2;
    }

    @Override // defpackage.aoq, defpackage.aoe
    public final String a(Context context) {
        if (this.b != null) {
            return this.b.a;
        }
        return null;
    }

    @Override // defpackage.aoq, defpackage.aoe
    public final aof a(Context context, String str) {
        dan dan;
        String str2;
        dih dih;
        dih dih2;
        if (this.b != null && !this.b.a.equals(str)) {
            str2 = context.getResources().getString(R.string.invalid_account);
            dan = null;
        } else if (TextUtils.isEmpty(this.c)) {
            str2 = context.getResources().getString(R.string.invalid_title);
            dan = null;
        } else if (this.d == null || !ajd.b(this.d)) {
            dan = null;
            str2 = null;
        } else {
            dii a = ((dii) dan.f.a(bg.ao)).a(((dii) dao.c.a(bg.ao)).b(this.c).a(this.d));
            if (a.b) {
                dih = a.a;
            } else {
                dih dih3 = a.a;
                djz.a.a(dih3).c(dih3);
                a.b = true;
                dih = a.a;
            }
            dih dih4 = dih;
            if (!dih.a(dih4, Boolean.TRUE.booleanValue())) {
                throw new dkw();
            }
            dan = (dan) dih4;
            str2 = null;
        }
        if (str2 == null) {
            String a2 = ain.b(context, str).a();
            dii g = ((dii) dby.g.a(bg.ao)).g(((dii) dca.g.a(bg.ao)).f(this.c));
            if (dan != null) {
                dca f = g.f();
                dii dii = (dii) f.a(bg.ao);
                dii.a((dih) f);
                dii dii2 = dii;
                dii2.b();
                dca dca = (dca) dii2.a;
                if (dan == null) {
                    throw new NullPointerException();
                }
                dca.f = dan;
                g.g(dii2);
            }
            anc c2 = any.get().c();
            if (g.b) {
                dih2 = g.a;
            } else {
                dih dih5 = g.a;
                djz.a.a(dih5).c(dih5);
                g.b = true;
                dih2 = g.a;
            }
            dih dih6 = dih2;
            if (!dih.a(dih6, Boolean.TRUE.booleanValue())) {
                throw new dkw();
            }
            c2.a(a2, (dby) dih6, 0, (String) null);
        } else {
            Toast.makeText(context, str2, 0).show();
        }
        return aoe.a;
    }
}
