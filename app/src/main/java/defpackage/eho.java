package defpackage;

import java.io.FileDescriptor;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.net.SocketImpl;

/* renamed from: eho  reason: default package */
/* compiled from: PG */
final class eho extends SocketImpl {
    eho(FileDescriptor fileDescriptor) {
        this.fd = fileDescriptor;
    }

    /* access modifiers changed from: protected */
    @Override // java.net.SocketImpl
    public final void accept(SocketImpl socketImpl) {
        throw new RuntimeException("accept not implemented");
    }

    /* access modifiers changed from: protected */
    @Override // java.net.SocketImpl
    public final int available() {
        throw new RuntimeException("accept not implemented");
    }

    /* access modifiers changed from: protected */
    @Override // java.net.SocketImpl
    public final void bind(InetAddress inetAddress, int i) {
        throw new RuntimeException("accept not implemented");
    }

    /* access modifiers changed from: protected */
    @Override // java.net.SocketImpl
    public final void close() {
    }

    /* access modifiers changed from: protected */
    @Override // java.net.SocketImpl
    public final void connect(InetAddress inetAddress, int i) {
        throw new RuntimeException("connect not implemented");
    }

    /* access modifiers changed from: protected */
    @Override // java.net.SocketImpl
    public final void connect(SocketAddress socketAddress, int i) {
        throw new RuntimeException("connect not implemented");
    }

    /* access modifiers changed from: protected */
    @Override // java.net.SocketImpl
    public final void connect(String str, int i) {
        throw new RuntimeException("connect not implemented");
    }

    /* access modifiers changed from: protected */
    @Override // java.net.SocketImpl
    public final void create(boolean z) {
    }

    /* access modifiers changed from: protected */
    @Override // java.net.SocketImpl
    public final InputStream getInputStream() {
        throw new RuntimeException("getInputStream not implemented");
    }

    /* access modifiers changed from: protected */
    @Override // java.net.SocketImpl
    public final OutputStream getOutputStream() {
        throw new RuntimeException("getOutputStream not implemented");
    }

    /* access modifiers changed from: protected */
    @Override // java.net.SocketImpl
    public final void listen(int i) {
        throw new RuntimeException("listen not implemented");
    }

    /* access modifiers changed from: protected */
    @Override // java.net.SocketImpl
    public final void sendUrgentData(int i) {
        throw new RuntimeException("sendUrgentData not implemented");
    }

    @Override // java.net.SocketOptions
    public final Object getOption(int i) {
        throw new RuntimeException("getOption not implemented");
    }

    @Override // java.net.SocketOptions
    public final void setOption(int i, Object obj) {
        throw new RuntimeException("setOption not implemented");
    }
}
