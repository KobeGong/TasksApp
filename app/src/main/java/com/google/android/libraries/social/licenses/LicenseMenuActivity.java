package com.google.android.libraries.social.licenses;

/* compiled from: PG */
public final class LicenseMenuActivity extends defpackage.wm implements defpackage.cpw {
    /* access modifiers changed from: protected */
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131034179);
        if (g().a() != null) {
            g().a().a(true);
        }
        defpackage.ln c = getSupportFragmentManager();
        if (!(c.findFragmentById(2131755306) instanceof defpackage.cpu)) {
            defpackage.cpu cpu = new defpackage.cpu();
            if (getIntent().hasExtra("pluginLicensePaths")) {
                cpu.e(getIntent().getBundleExtra("pluginLicensePaths"));
            }
            c.beginTransaction().add(cpu).d();
        }
    }

    public final boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    public final void a(defpackage.cpq cpq) {
        android.content.Intent intent = new android.content.Intent(this, com.google.android.libraries.social.licenses.LicenseActivity.class);
        intent.putExtra("license", cpq);
        startActivity(intent);
    }
}
