package defpackage;

import java.io.FileDescriptor;
import java.net.Socket;

/* renamed from: ehn  reason: default package */
/* compiled from: PG */
public final class ehn extends Socket {
    public ehn(FileDescriptor fileDescriptor) {
        super(new eho(fileDescriptor));
    }
}
