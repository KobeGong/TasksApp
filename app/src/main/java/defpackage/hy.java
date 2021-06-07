package defpackage;

import java.io.File;
import java.io.FileFilter;

/* renamed from: hy  reason: default package */
/* compiled from: PG */
public final class hy implements FileFilter {
    private final /* synthetic */ String a;

    public hy(String str) {
        this.a = str;
    }

    public final boolean accept(File file) {
        String name = file.getName();
        return !name.startsWith(this.a) && !name.equals("MultiDex.lock");
    }
}
