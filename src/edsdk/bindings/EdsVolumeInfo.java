package edsdk.bindings;

import java.util.Arrays;
import java.util.List;

import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;

/**
 * <i>native declaration : EDSDK\Header\EDSDKTypes.h</i><br>
 * This file was autogenerated by <a
 * href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a
 * href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few
 * opensource projects.</a>.<br>
 * For help, please visit <a
 * href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a
 * href="http://rococoa.dev.java.net/">Rococoa</a>, or <a
 * href="http://jna.dev.java.net/">JNA</a>.
 */
public class EdsVolumeInfo extends Structure {

    /// C type : EdsUInt32
    public NativeLong storageType;
    /**
     * @see EdsAccess<br>
     *      C type : EdsAccess
     */
    public int access;
    /// C type : EdsUInt64
    public long maxCapacity;
    /// C type : EdsUInt64
    public long freeSpaceInBytes;
    /// C type : EdsChar[256]
    public byte[] szVolumeLabel = new byte[256];

    public EdsVolumeInfo() {
        super();
        getFieldOrder();
    }

    @Override
    protected List getFieldOrder() {
        return Arrays.asList( new String[] { "storageType", "access",
                                            "maxCapacity", "freeSpaceInBytes",
                                            "szVolumeLabel" } );

    }

    /**
     * @param storageType C type : EdsUInt32<br>
     * @param access @see EdsAccess<br>
     *            C type : EdsAccess<br>
     * @param maxCapacity C type : EdsUInt64<br>
     * @param freeSpaceInBytes C type : EdsUInt64<br>
     * @param szVolumeLabel C type : EdsChar[256]
     */
    public EdsVolumeInfo( final NativeLong storageType, final int access,
                          final long maxCapacity, final long freeSpaceInBytes,
                          final byte szVolumeLabel[] ) {
        super();
        this.storageType = storageType;
        this.access = access;
        this.maxCapacity = maxCapacity;
        this.freeSpaceInBytes = freeSpaceInBytes;
        if ( szVolumeLabel.length != this.szVolumeLabel.length ) {
            throw new IllegalArgumentException( "Wrong array size !" );
        }
        this.szVolumeLabel = szVolumeLabel;
        getFieldOrder();
    }

    public EdsVolumeInfo( final Pointer pointer ) {
        super( pointer );
        read();
    }

    public static class ByReference extends EdsVolumeInfo implements Structure.ByReference {
        //generated
    }

    public static class ByValue extends EdsVolumeInfo implements Structure.ByValue {
        //generated
    }
}
