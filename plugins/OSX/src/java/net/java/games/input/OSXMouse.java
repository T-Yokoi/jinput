package net.java.games.input;

/**
 * Created by IntelliJ IDEA.
 * User: gpierce
 * Date: Aug 2, 2003
 * Time: 3:57:00 PM
 * To change this template use Options | File Templates.
 */
public class OSXMouse extends InputController
{
    public OSXMouse( OSXEnvironmentPlugin plugin )
    {
        super( plugin );
    }

    public OSXMouse( OSXEnvironmentPlugin plugin, long lpDevice, String productName, int usage )
    {
        super( plugin, lpDevice, productName, usage );
    }

    public OSXMouse( OSXEnvironmentPlugin plugin, long lpDevice, String transportKey, int vendorID, int productID, int version, String manufacturer, String productName, String serialNumber, int usbLocationID, int usagePage, int usage)
    {
        super( plugin, lpDevice, transportKey, vendorID, productID, version, manufacturer, productName, serialNumber, usbLocationID, usagePage, usage );
    }
}
