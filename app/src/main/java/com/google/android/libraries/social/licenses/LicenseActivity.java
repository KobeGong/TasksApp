package com.google.android.libraries.social.licenses;

/* compiled from: PG */
public final class LicenseActivity extends defpackage.wm {
    public final void onCreate(android.os.Bundle bundle) {
        java.lang.String a;
        super.onCreate(bundle);
        setContentView(2131034178);
        defpackage.cpq cpq = (defpackage.cpq) getIntent().getParcelableExtra("license");
        g().a().a((java.lang.CharSequence) cpq.a);
        g().a().b();
        g().a().a(true);
        g().a().a();
        android.widget.TextView textView = (android.widget.TextView) findViewById(2131755305);
        long j = cpq.b;
        int i = cpq.c;
        java.lang.String str = cpq.d;
        if (str.isEmpty()) {
            a = defpackage.cky.a((android.content.Context) this, "third_party_licenses", j, i);
        } else {
            a = defpackage.cky.a("res/raw/third_party_licenses", str, j, i);
            if (a == null) {
                throw new java.lang.RuntimeException(new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 46).append(str).append(" does not contain res/raw/third_party_licenses").toString());
            }
        }
        if (a == null) {
            finish();
        } else {
            textView.setText(a);
        }
    }

    public final void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        android.widget.TextView textView = (android.widget.TextView) findViewById(2131755305);
        bundle.putInt("scroll_pos", textView.getLayout().getLineStart(textView.getLayout().getLineForVertical(((android.widget.ScrollView) findViewById(2131755304)).getScrollY())));
    }

    public final void onRestoreInstanceState(android.os.Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        android.widget.ScrollView scrollView = (android.widget.ScrollView) findViewById(2131755304);
        scrollView.post(new defpackage.cps(this, bundle.getInt("scroll_pos"), scrollView));
    }

    public final boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}
