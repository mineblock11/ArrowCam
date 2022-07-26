package mine.block.arrowcam.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.projectile.PersistentProjectileEntity;

@Environment(EnvType.CLIENT)
public class ArrowCamClient implements ClientModInitializer {

    public static boolean ENABLED = false;

    public static void setENABLED(boolean val) {
        ENABLED = val;

        MinecraftClient mc = MinecraftClient.getInstance();

        if(ENABLED) {
            mc.options.hudHidden = true;
        } else {
            mc.options.hudHidden = false;
        }
    }
    public static PersistentProjectileEntity target;
//    public static boolean hideGUI;
//
//    /** Stores the FOV before entering arrow cam */
//    public static int fovSetting;
//
//    /** Stores the POV before entering arrow cam */
//    public static Perspective thirdPersonView;
//    public static PersistentProjectileEntity camera;
//
//    public static boolean isInArrowCam(){
//        if (camera == null) return false;
//        return camera.isOnGround();
//    }
//
//    public static void stop() {
//        if(isInArrowCam()){
//
//            MinecraftClient mc = MinecraftClient.getInstance();
//            mc.options.hudHidden = hideGUI;
//            mc.options.getFov().setValue(fovSetting);
//            mc.options.setPerspective(thirdPersonView);
//            mc.setCameraEntity(mc.player);
//
//            camera = null;
//        }
//    }
//
//    public static void startArrowCam(PersistentProjectileEntity arrow){
//        if(!isInArrowCam()){
//            camera = arrow;
//                MinecraftClient mc = MinecraftClient.getInstance();
//
//                hideGUI = mc.options.hudHidden;
//                fovSetting = mc.options.getFov().getValue();
//                thirdPersonView = mc.options.getPerspective();
//
//                mc.options.hudHidden = true;
//                mc.options.getFov().setValue((int) (fovSetting * 1.1F));
//                mc.options.setPerspective(thirdPersonView != Perspective.FIRST_PERSON ? thirdPersonView : Perspective.THIRD_PERSON_FRONT);
//                mc.setCameraEntity(camera);
//        }
//    }


    @Override
    public void onInitializeClient() {
//        Registry.register(Registry.ENTITY_TYPE, new Identifier("arrowcam", "arrowcam_entity"), ArrowCamEntity.ENTITY_TYPE);

    }
}
