import slimeknights.tconstruct.TConstruct
import slimeknights.tconstruct.common.config.Config
import slimeknights.tconstruct.library.MaterialIntegration
import slimeknights.tconstruct.library.TinkerRegistry
import slimeknights.tconstruct.library.materials.Material
import slimeknights.tconstruct.smeltery.TinkerSmeltery

/*
 * Copyright (c) 2018 Bartz24 (Original Author)
 * Copyright (c) 2026 eridanisys (Modifications)
 *
 * This script is a derivative work of MoarTinkers' "MoarMaterialIntegration" class.
 * It is licensed under the GNU Lesser General Public License, version 2.1.
 * You may obtain a copy of the License at: https://www.gnu.org/licenses/old-licenses/lgpl-2.1.html
 *
 * This file is distributed WITHOUT ANY WARRANTY; without even the implied 
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 */

class LessMaterialIntegration extends MaterialIntegration {
    protected boolean isIntegrated
    private boolean preInit
    protected boolean force

    LessMaterialIntegration(Material mat, Fluid fluid, String oreSuffix) {
        this("ingot" + oreSuffix, material, fluid, oreSuffix)
    }
}