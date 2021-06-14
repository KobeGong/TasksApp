package com.google.android.libraries.social.licenses;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.apps.tasks.R;

import defpackage.cpq;
import defpackage.cpu;
import defpackage.cpw;
import defpackage.wm;

/* compiled from: PG */
public final class LicenseMenuActivity extends wm implements cpw {
    /* access modifiers changed from: protected */
    @Override // defpackage.nv, defpackage.wm, defpackage.lg
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.libraries_social_licenses_license_menu_activity);
        if (g().a() != null) {
            g().a().a(true);
        }
        ln c = c();
        if (!(c.a(R.id.license_menu_fragment_container) instanceof cpu)) {
            cpu cpu = new cpu();
            if (getIntent().hasExtra("pluginLicensePaths")) {
                cpu.e(getIntent().getBundleExtra("pluginLicensePaths"));
            }
            c.a().a(cpu).d();
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    @Override // defpackage.cpw
    public final void a(cpq cpq) {
        Intent intent = new Intent(this, LicenseActivity.class);
        intent.putExtra("license", cpq);
        startActivity(intent);
    }
}
