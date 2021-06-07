package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;

@DynamiteApi
/* compiled from: PG */
public class FlagProviderImpl extends bjl {
    private boolean a = false;
    private SharedPreferences b;

    @Override // defpackage.bjk
    public void init(bfl bfl) {
        Context context = (Context) bfo.a(bfl);
        if (!this.a) {
            try {
                this.b = bha.a(context.createPackageContext("com.google.android.gms", 0));
                this.a = true;
            } catch (PackageManager.NameNotFoundException e) {
            } catch (Exception e2) {
                String valueOf = String.valueOf(e2.getMessage());
                Log.w("FlagProviderImpl", valueOf.length() != 0 ? "Could not retrieve sdk flags, continuing with defaults: ".concat(valueOf) : new String("Could not retrieve sdk flags, continuing with defaults: "));
            }
        }
    }

    @Override // defpackage.bjk
    public boolean getBooleanFlagValue(String str, boolean z, int i) {
        return !this.a ? z : bgv.a(this.b, str, Boolean.valueOf(z)).booleanValue();
    }

    @Override // defpackage.bjk
    public int getIntFlagValue(String str, int i, int i2) {
        return !this.a ? i : bgv.a(this.b, str, Integer.valueOf(i)).intValue();
    }

    @Override // defpackage.bjk
    public long getLongFlagValue(String str, long j, int i) {
        return !this.a ? j : bgv.a(this.b, str, Long.valueOf(j)).longValue();
    }

    @Override // defpackage.bjk
    public String getStringFlagValue(String str, String str2, int i) {
        return !this.a ? str2 : bgv.a(this.b, str, str2);
    }
}
