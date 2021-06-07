package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: bgl  reason: default package */
/* compiled from: PG */
public final class bgl extends biq {
    public static final Parcelable.Creator CREATOR = new bgs();
    public File a;
    private ParcelFileDescriptor b;
    private final String c;
    private final String d;

    bgl(ParcelFileDescriptor parcelFileDescriptor, String str, String str2) {
        this.b = parcelFileDescriptor;
        this.c = str;
        this.d = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.b == null) {
            DataOutputStream dataOutputStream = new DataOutputStream(a());
            Object[] objArr = null;
            try {
                dataOutputStream.writeInt(objArr.length);
                dataOutputStream.writeUTF(this.c);
                dataOutputStream.writeUTF(this.d);
                dataOutputStream.write((byte[]) null);
                a(dataOutputStream);
            } catch (IOException e) {
                throw new IllegalStateException("Could not write into unlinked file", e);
            } catch (Throwable th) {
                a(dataOutputStream);
                throw th;
            }
        }
        int q = bjr.q(parcel, 20293);
        bjr.a(parcel, 2, this.b, i);
        bjr.a(parcel, 3, this.c);
        bjr.a(parcel, 4, this.d);
        bjr.r(parcel, q);
    }

    private final FileOutputStream a() {
        if (this.a == null) {
            throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel.");
        }
        try {
            File createTempFile = File.createTempFile("teleporter", ".tmp", this.a);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                this.b = ParcelFileDescriptor.open(createTempFile, 268435456);
                createTempFile.delete();
                return fileOutputStream;
            } catch (FileNotFoundException e) {
                throw new IllegalStateException("Temporary file is somehow already deleted.");
            }
        } catch (IOException e2) {
            throw new IllegalStateException("Could not create temporary file:", e2);
        }
    }

    private static void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("FileTeleporter", "Could not close stream", e);
        }
    }
}
