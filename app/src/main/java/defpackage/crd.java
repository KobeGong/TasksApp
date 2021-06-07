package defpackage;

import java.io.Serializable;
import java.net.URI;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: crd  reason: default package */
/* compiled from: PG */
public abstract class crd implements Serializable {
    public static final long serialVersionUID = 808575179767517313L;

    public abstract Map b();

    public void a(URI uri, Executor executor, crf crf) {
        executor.execute(new cre(this, uri, crf));
    }
}
