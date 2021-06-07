package com.google.android.libraries.social.licenses;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.apps.tasks.R;

/* compiled from: PG */
public final class LicenseActivity extends wm {
    @Override // defpackage.nv, defpackage.wm, defpackage.lg
    public final void onCreate(Bundle bundle) {
        String a;
        super.onCreate(bundle);
        setContentView(R.layout.libraries_social_licenses_license_activity);
        cpq cpq = (cpq) getIntent().getParcelableExtra("license");
        g().a().a(cpq.a);
        g().a().b();
        g().a().a(true);
        g().a().a();
        TextView textView = (TextView) findViewById(R.id.license_activity_textview);
        long j = cpq.b;
        int i = cpq.c;
        String str = cpq.d;
        if (str.isEmpty()) {
            a = cky.a(this, "third_party_licenses", j, i);
        } else {
            a = cky.a("res/raw/third_party_licenses", str, j, i);
            if (a == null) {
                throw new RuntimeException(new StringBuilder(String.valueOf(str).length() + 46).append(str).append(" does not contain res/raw/third_party_licenses").toString());
            }
        }
        if (a == null) {
            finish();
        } else {
            textView.setText(a);
        }
    }

    @Override // defpackage.nv, defpackage.wm, defpackage.lg
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        TextView textView = (TextView) findViewById(R.id.license_activity_textview);
        bundle.putInt("scroll_pos", textView.getLayout().getLineStart(textView.getLayout().getLineForVertical(((ScrollView) findViewById(R.id.license_activity_scrollview)).getScrollY())));
    }

    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        ScrollView scrollView = (ScrollView) findViewById(R.id.license_activity_scrollview);
        scrollView.post(new cps(this, bundle.getInt("scroll_pos"), scrollView));
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}
