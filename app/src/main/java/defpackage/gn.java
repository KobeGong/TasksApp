package defpackage;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* renamed from: gn  reason: default package */
/* compiled from: PG */
public final class gn {
    public static long a(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            long length = randomAccessFile.length() - 22;
            if (length < 0) {
                throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
            }
            long j = length - 65536;
            if (j < 0) {
                j = 0;
            }
            int reverseBytes = Integer.reverseBytes(101010256);
            do {
                randomAccessFile.seek(length);
                if (randomAccessFile.readInt() != reverseBytes) {
                    length--;
                } else {
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    ia iaVar = new ia();
                    iaVar.b = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                    iaVar.a = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                    CRC32 crc32 = new CRC32();
                    long j2 = iaVar.b;
                    randomAccessFile.seek(iaVar.a);
                    byte[] bArr = new byte[16384];
                    int read = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j2));
                    while (read != -1) {
                        crc32.update(bArr, 0, read);
                        j2 -= (long) read;
                        if (j2 == 0) {
                            break;
                        }
                        read = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j2));
                    }
                    return crc32.getValue();
                }
            } while (length >= j);
            throw new ZipException("End Of Central Directory signature not found");
        } finally {
            randomAccessFile.close();
        }
    }
}
