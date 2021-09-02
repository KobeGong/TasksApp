package com.google.android.gms.flags.impl;

@com.google.android.gms.common.util.DynamiteApi
/* compiled from: PG */
public class FlagProviderImpl extends defpackage.bjl {
    private boolean a = false;
    private android.content.SharedPreferences b;

    public void init(defpackage.bfl bfl) {
        android.content.Context context = (android.content.Context) defpackage.bfo.a(bfl);
        if (!this.a) {
            try {
                this.b = defpackage.bha.a(context.createPackageContext("com.google.android.gms", 0));
                this.a = true;
            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            } catch (java.lang.Exception e2) {
                java.lang.String str = "FlagProviderImpl";
                java.lang.String str2 = "Could not retrieve sdk flags, continuing with defaults: ";
                java.lang.String valueOf = java.lang.String.valueOf(e2.getMessage());
                android.util.Log.w(str, valueOf.length() != 0 ? str2.concat(valueOf) : new java.lang.String(str2));
            }
        }
    }

    public boolean getBooleanFlagValue(java.lang.String str, boolean z, int i) {
        return !this.a ? z : defpackage.bgv.a(this.b, str, java.lang.Boolean.valueOf(z)).booleanValue();
    }

    public int getIntFlagValue(java.lang.String str, int i, int i2) {
        return !this.a ? i : defpackage.bgv.a(this.b, str, java.lang.Integer.valueOf(i)).intValue();
    }

    public long getLongFlagValue(java.lang.String str, long j, int i) {
        return !this.a ? j : defpackage.bgv.a(this.b, str, java.lang.Long.valueOf(j)).longValue();
    }

    public java.lang.String getStringFlagValue(java.lang.String str, java.lang.String str2, int i) {
        return !this.a ? str2 : defpackage.bgv.a(this.b, str, str2);
    }
}
