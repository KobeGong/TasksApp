package org.chromium.net.impl;

import android.content.Context;
import org.chromium.base.annotations.UsedByReflection;

import defpackage.ehu;
import defpackage.ehx;
import defpackage.ehz;
import defpackage.ekn;

/* compiled from: PG */
public class NativeCronetProvider extends ehx {
    @UsedByReflection
    public NativeCronetProvider(Context context) {
        super(context);
    }

    @Override // defpackage.ehx
    public final ehu a() {
        return new ehz(new ekn(this.a));
    }

    @Override // defpackage.ehx
    public final String b() {
        return "App-Packaged-Cronet-Provider";
    }

    @Override // defpackage.ehx
    public final String c() {
        return "67.0.3387.0";
    }

    @Override // defpackage.ehx
    public final boolean d() {
        return true;
    }
}
