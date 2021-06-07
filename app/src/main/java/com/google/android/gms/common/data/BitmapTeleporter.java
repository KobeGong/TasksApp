package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: PG */
public class BitmapTeleporter extends biq implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bct();
    public File a;
    private int b;
    private ParcelFileDescriptor c;
    private int d;
    private Bitmap e;

    public BitmapTeleporter(int i, ParcelFileDescriptor parcelFileDescriptor, int i2) {
        this.b = i;
        this.c = parcelFileDescriptor;
        this.d = i2;
        this.e = null;
    }

    public BitmapTeleporter(Bitmap bitmap) {
        this.b = 1;
        this.c = null;
        this.d = 0;
        this.e = bitmap;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this.c == null) {
            Bitmap bitmap = this.e;
            ByteBuffer allocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
            bitmap.copyPixelsToBuffer(allocate);
            byte[] array = allocate.array();
            DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(a()));
            try {
                dataOutputStream.writeInt(array.length);
                dataOutputStream.writeInt(bitmap.getWidth());
                dataOutputStream.writeInt(bitmap.getHeight());
                dataOutputStream.writeUTF(bitmap.getConfig().toString());
                dataOutputStream.write(array);
                a(dataOutputStream);
            } catch (IOException e2) {
                throw new IllegalStateException("Could not write into unlinked file", e2);
            } catch (Throwable th) {
                a(dataOutputStream);
                throw th;
            }
        }
        int q = bjr.q(parcel, 20293);
        bjr.c(parcel, 1, this.b);
        bjr.a(parcel, 2, this.c, i | 1);
        bjr.c(parcel, 3, this.d);
        bjr.r(parcel, q);
        this.c = null;
    }

    private final FileOutputStream a() {
        if (this.a == null) {
            throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
        }
        try {
            File createTempFile = File.createTempFile("teleporter", ".tmp", this.a);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                this.c = ParcelFileDescriptor.open(createTempFile, 268435456);
                createTempFile.delete();
                return fileOutputStream;
            } catch (FileNotFoundException e2) {
                throw new IllegalStateException("Temporary file is somehow already deleted");
            }
        } catch (IOException e3) {
            throw new IllegalStateException("Could not create temporary file", e3);
        }
    }

    private static void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e2) {
            Log.w("BitmapTeleporter", "Could not close stream", e2);
        }
    }
}
