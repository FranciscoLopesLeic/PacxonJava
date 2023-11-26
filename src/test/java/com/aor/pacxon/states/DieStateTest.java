package com.aor.pacxon.states;
import com.aor.pacxon.controller.Controller;
import com.aor.pacxon.controller.MenuDieController;
import com.aor.pacxon.model.MenuDie;
import com.aor.pacxon.viewer.MenuDieViewer;
import com.aor.pacxon.viewer.Viewer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class DieStateTest {

    //Verifica se o modelo associado ao Viewer é o mesmo MenuDie criado anteriormente.
    @Test
    void testGetViewer() {
        MenuDie menuDie = new MenuDie(); // Cria uma instância de MenuDie
        DieState dieState = new DieState(menuDie);

        Viewer<MenuDie> viewer = dieState.getViewer();

        assertNotNull(viewer);
        assertTrue(viewer instanceof MenuDieViewer);
        assertEquals(menuDie, viewer.getModel());
    }

    //Verifica se o modelo associado ao Controller é o mesmo MenuDie criado anteriormente
    @Test
    void testGetController() {
        MenuDie menuDie = new MenuDie(); // Cria uma instância de MenuDie
        DieState dieState = new DieState(menuDie);

        Controller<MenuDie> controller = dieState.getController();

        assertNotNull(controller);
        assertTrue(controller instanceof MenuDieController);
        assertEquals(menuDie, controller.getModel());
    }

}
