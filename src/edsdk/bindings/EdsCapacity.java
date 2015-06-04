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
public class EdsCapacity extends Structure {

    /// C type : EdsInt32
    public NativeLong numberOfFreeClusters;
    /// C type : EdsInt32
    public NativeLong bytesPerSector;
    /// C type : EdsBool
    public int reset;

    public EdsCapacity() {
        super();
        getFieldOrder();
    }

    /**
     * @param numberOfFreeClusters C type : EdsInt32<br>
     * @param bytesPerSector C type : EdsInt32<br>
     * @param reset C type : EdsBool
     */
    public EdsCapacity( final NativeLong numberOfFreeClusters,
                        final NativeLong bytesPerSector, final int reset ) {
        super();
        this.numberOfFreeClusters = numberOfFreeClusters;
        this.bytesPerSector = bytesPerSector;
        this.reset = reset;
        getFieldOrder();
    }

    public EdsCapacity( final Pointer pointer ) {
        super( pointer );
        read();
    }

    public static class ByReference extends EdsCapacity implements Structure.ByReference {
        //generated
    }

    public static class ByValue extends EdsCapacity implements Structure.ByValue {
        //generated
    }

    @Override
    protected List getFieldOrder() {
        return Arrays.asList( new String[] { "numberOfFreeClusters",
                                            "bytesPerSector", "reset" } );

    }
}
