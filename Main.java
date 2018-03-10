package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import javafx.fxml.FXML;

import java.awt.*;

import static kotlin.text.StringsKt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("IV Guesser");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

@Metadata(
        mv = {1, 1, 9},
        bv = {1, 0, 2},
        k = 2,
        d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a&\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001\u001a\u0019\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000b¨\u0006\f"},
        d2 = {"cpformula", "", "atk", "def", "hp", "cpm", "main", "", "args", "", "", "([Ljava/lang/String;)V", "production sources for module APP 100 IV Alert"}
)


final class iv_Class {
    @FXML
    private TextField cp_Pkm;
    private TextField nome_Pkm;
    private TextField show_Iv;

    public void main(@NotNull String[] args) {
        Intrinsics.checkParameterIsNotNull(args, "args");
        double atk;
        double def;
        double hp;
        int lvl;
        double cp;
        double iva;
        double ivd;
        double ivh;
        double percent;
        int l = 0;
        Double[] cpm = new Double[]{0.094D, 0.16639787D, 0.21573247D, 0.25572005D, 0.29024988D, 0.3210876D, 0.34921268D, 0.37523559D, 0.39956728D, 0.42250001D, 0.44310755D, 0.46279839D, 0.48168495D, 0.49985844D, 0.51739395D, 0.53435433D, 0.55079269D, 0.56675452D, 0.58227891D, 0.59740001D, 0.61215729D, 0.62656713D, 0.64065295D, 0.65443563D, 0.667934D, 0.68116492D, 0.69414365D, 0.70688421D, 0.71939909D, 0.7317D, 0.73776948D, 0.74378943D, 0.74976104D, 0.75568551D, 0.76156384D, 0.76739717D, 0.7731865D, 0.77893275D, 0.78463697D};
        String var10000 = nome_Pkm.getText();
        if (var10000 == null) {
            Intrinsics.throwNpe();
        }

        String pkm = var10000;

        if (pkm == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        } else {
            var10000 = pkm.toLowerCase();
            Intrinsics.checkExpressionValueIsNotNull(var10000, "(this as java.lang.String).toLowerCase()");
            pkm = var10000;
            pkm = capitalize(pkm);

            int CP;
            do {
                var10000 = cp_Pkm.getText();
                if (var10000 == null) {
                    Intrinsics.throwNpe();
                }

                String var22 = var10000;
                CP = Integer.parseInt(var22);
                if (Intrinsics.areEqual(pkm, "Bulbasaur")) {
                    atk = 118.0D;
                    def = 118.0D;
                    hp = 90.0D;
                } else if (Intrinsics.areEqual(pkm, "Ivysaur")) {
                    atk = 151.0D;
                    def = 151.0D;
                    hp = 120.0D;
                } else if (Intrinsics.areEqual(pkm, "Venusaur")) {
                    atk = 198.0D;
                    def = 198.0D;
                    hp = 160.0D;
                } else if (Intrinsics.areEqual(pkm, "Charmander")) {
                    atk = 116.0D;
                    def = 96.0D;
                    hp = 78.0D;
                } else if (Intrinsics.areEqual(pkm, "Charmeleon")) {
                    atk = 158.0D;
                    def = 129.0D;
                    hp = 116.0D;
                } else if (Intrinsics.areEqual(pkm, "Charizard")) {
                    atk = 223.0D;
                    def = 176.0D;
                    hp = 156.0D;
                } else if (Intrinsics.areEqual(pkm, "Squirtle")) {
                    atk = 94.0D;
                    def = 122.0D;
                    hp = 88.0D;
                } else if (Intrinsics.areEqual(pkm, "Wartortle")) {
                    atk = 126.0D;
                    def = 155.0D;
                    hp = 118.0D;
                } else if (Intrinsics.areEqual(pkm, "Blastoise")) {
                    atk = 171.0D;
                    def = 210.0D;
                    hp = 158.0D;
                } else if (Intrinsics.areEqual(pkm, "Caterpie")) {
                    atk = 55.0D;
                    def = 62.0D;
                    hp = 90.0D;
                } else if (Intrinsics.areEqual(pkm, "Metapod")) {
                    atk = 45.0D;
                    def = 94.0D;
                    hp = 100.0D;
                } else if (Intrinsics.areEqual(pkm, "Butterfree")) {
                    atk = 167.0D;
                    def = 151.0D;
                    hp = 120.0D;
                } else if (Intrinsics.areEqual(pkm, "Weedle")) {
                    atk = 63.0D;
                    def = 55.0D;
                    hp = 80.0D;
                } else if (Intrinsics.areEqual(pkm, "Kakuna")) {
                    atk = 46.0D;
                    def = 86.0D;
                    hp = 90.0D;
                } else if (Intrinsics.areEqual(pkm, "Beedrill")) {
                    atk = 169.0D;
                    def = 150.0D;
                    hp = 130.0D;
                } else if (Intrinsics.areEqual(pkm, "Pidgey")) {
                    atk = 85.0D;
                    def = 76.0D;
                    hp = 80.0D;
                } else if (Intrinsics.areEqual(pkm, "Pidgeotto")) {
                    atk = 117.0D;
                    def = 108.0D;
                    hp = 126.0D;
                } else if (Intrinsics.areEqual(pkm, "Pidgeot")) {
                    atk = 166.0D;
                    def = 157.0D;
                    hp = 166.0D;
                } else if (Intrinsics.areEqual(pkm, "Rattata")) {
                    atk = 103.0D;
                    def = 70.0D;
                    hp = 60.0D;
                } else if (Intrinsics.areEqual(pkm, "Raticate")) {
                    atk = 161.0D;
                    def = 144.0D;
                    hp = 110.0D;
                } else if (Intrinsics.areEqual(pkm, "Spearow")) {
                    atk = 112.0D;
                    def = 61.0D;
                    hp = 80.0D;
                } else if (Intrinsics.areEqual(pkm, "Fearow")) {
                    atk = 182.0D;
                    def = 135.0D;
                    hp = 130.0D;
                } else if (Intrinsics.areEqual(pkm, "Ekans")) {
                    atk = 110.0D;
                    def = 102.0D;
                    hp = 70.0D;
                } else if (Intrinsics.areEqual(pkm, "Arbok")) {
                    atk = 167.0D;
                    def = 158.0D;
                    hp = 120.0D;
                } else if (Intrinsics.areEqual(pkm, "Pikachu")) {
                    atk = 112.0D;
                    def = 101.0D;
                    hp = 70.0D;
                } else if (Intrinsics.areEqual(pkm, "Raichu")) {
                    atk = 193.0D;
                    def = 165.0D;
                    hp = 120.0D;
                } else if (Intrinsics.areEqual(pkm, "Sandshrew")) {
                    atk = 126.0D;
                    def = 145.0D;
                    hp = 100.0D;
                } else if (Intrinsics.areEqual(pkm, "Sandslash")) {
                    atk = 182.0D;
                    def = 202.0D;
                    hp = 150.0D;
                } else if (Intrinsics.areEqual(pkm, "NidoranF")) {
                    atk = 86.0D;
                    def = 94.0D;
                    hp = 110.0D;
                } else if (Intrinsics.areEqual(pkm, "Nidorina")) {
                    atk = 117.0D;
                    def = 126.0D;
                    hp = 140.0D;
                } else if (Intrinsics.areEqual(pkm, "Nidoqueen")) {
                    atk = 180.0D;
                    def = 174.0D;
                    hp = 180.0D;
                } else if (Intrinsics.areEqual(pkm, "NidoranM")) {
                    atk = 105.0D;
                    def = 76.0D;
                    hp = 92.0D;
                } else if (Intrinsics.areEqual(pkm, "Nidorino")) {
                    atk = 137.0D;
                    def = 112.0D;
                    hp = 122.0D;
                } else if (Intrinsics.areEqual(pkm, "Nidoking")) {
                    atk = 204.0D;
                    def = 157.0D;
                    hp = 162.0D;
                } else if (Intrinsics.areEqual(pkm, "Clefairy")) {
                    atk = 107.0D;
                    def = 116.0D;
                    hp = 140.0D;
                } else if (Intrinsics.areEqual(pkm, "Clefable")) {
                    atk = 178.0D;
                    def = 171.0D;
                    hp = 190.0D;
                } else if (Intrinsics.areEqual(pkm, "Vulpix")) {
                    atk = 96.0D;
                    def = 122.0D;
                    hp = 76.0D;
                } else if (Intrinsics.areEqual(pkm, "Ninetales")) {
                    atk = 169.0D;
                    def = 204.0D;
                    hp = 146.0D;
                } else if (Intrinsics.areEqual(pkm, "Jigglypuff")) {
                    atk = 80.0D;
                    def = 44.0D;
                    hp = 230.0D;
                } else if (Intrinsics.areEqual(pkm, "Wigglytuff")) {
                    atk = 156.0D;
                    def = 93.0D;
                    hp = 280.0D;
                } else if (Intrinsics.areEqual(pkm, "Zubat")) {
                    atk = 83.0D;
                    def = 76.0D;
                    hp = 80.0D;
                } else if (Intrinsics.areEqual(pkm, "Golbat")) {
                    atk = 161.0D;
                    def = 153.0D;
                    hp = 150.0D;
                } else if (Intrinsics.areEqual(pkm, "Oddish")) {
                    atk = 131.0D;
                    def = 116.0D;
                    hp = 90.0D;
                } else if (Intrinsics.areEqual(pkm, "Gloom")) {
                    atk = 153.0D;
                    def = 139.0D;
                    hp = 120.0D;
                } else if (Intrinsics.areEqual(pkm, "Vileplume")) {
                    atk = 202.0D;
                    def = 170.0D;
                    hp = 150.0D;
                } else if (Intrinsics.areEqual(pkm, "Paras")) {
                    atk = 121.0D;
                    def = 99.0D;
                    hp = 70.0D;
                } else if (Intrinsics.areEqual(pkm, "Parasect")) {
                    atk = 165.0D;
                    def = 146.0D;
                    hp = 120.0D;
                } else if (Intrinsics.areEqual(pkm, "Venonat")) {
                    atk = 100.0D;
                    def = 102.0D;
                    hp = 120.0D;
                } else if (Intrinsics.areEqual(pkm, "Venomoth")) {
                    atk = 179.0D;
                    def = 150.0D;
                    hp = 140.0D;
                } else if (Intrinsics.areEqual(pkm, "Diglett")) {
                    atk = 109.0D;
                    def = 88.0D;
                    hp = 20.0D;
                } else if (Intrinsics.areEqual(pkm, "Dugtrio")) {
                    atk = 167.0D;
                    def = 147.0D;
                    hp = 70.0D;
                } else if (Intrinsics.areEqual(pkm, "Meowth")) {
                    atk = 92.0D;
                    def = 81.0D;
                    hp = 80.0D;
                } else if (Intrinsics.areEqual(pkm, "Persian")) {
                    atk = 150.0D;
                    def = 139.0D;
                    hp = 130.0D;
                } else if (Intrinsics.areEqual(pkm, "Psyduck")) {
                    atk = 122.0D;
                    def = 96.0D;
                    hp = 100.0D;
                } else if (Intrinsics.areEqual(pkm, "Golduck")) {
                    atk = 191.0D;
                    def = 163.0D;
                    hp = 160.0D;
                } else if (Intrinsics.areEqual(pkm, "Mankey")) {
                    atk = 148.0D;
                    def = 87.0D;
                    hp = 80.0D;
                } else if (Intrinsics.areEqual(pkm, "Primeape")) {
                    atk = 207.0D;
                    def = 144.0D;
                    hp = 130.0D;
                } else if (Intrinsics.areEqual(pkm, "Growlithe")) {
                    atk = 136.0D;
                    def = 96.0D;
                    hp = 110.0D;
                } else if (Intrinsics.areEqual(pkm, "Arcanine")) {
                    atk = 227.0D;
                    def = 166.0D;
                    hp = 180.0D;
                } else if (Intrinsics.areEqual(pkm, "Poliwag")) {
                    atk = 101.0D;
                    def = 82.0D;
                    hp = 80.0D;
                } else if (Intrinsics.areEqual(pkm, "Poliwhirl")) {
                    atk = 130.0D;
                    def = 130.0D;
                    hp = 130.0D;
                } else if (Intrinsics.areEqual(pkm, "Poliwrath")) {
                    atk = 182.0D;
                    def = 187.0D;
                    hp = 180.0D;
                } else if (Intrinsics.areEqual(pkm, "Abra")) {
                    atk = 195.0D;
                    def = 103.0D;
                    hp = 50.0D;
                } else if (Intrinsics.areEqual(pkm, "Kadabra")) {
                    atk = 232.0D;
                    def = 138.0D;
                    hp = 80.0D;
                } else if (Intrinsics.areEqual(pkm, "Alakazam")) {
                    atk = 271.0D;
                    def = 194.0D;
                    hp = 110.0D;
                } else if (Intrinsics.areEqual(pkm, "Machop")) {
                    atk = 137.0D;
                    def = 88.0D;
                    hp = 140.0D;
                } else if (Intrinsics.areEqual(pkm, "Machoke")) {
                    atk = 177.0D;
                    def = 130.0D;
                    hp = 160.0D;
                } else if (Intrinsics.areEqual(pkm, "Machamp")) {
                    atk = 234.0D;
                    def = 162.0D;
                    hp = 180.0D;
                } else if (Intrinsics.areEqual(pkm, "Bellsprout")) {
                    atk = 139.0D;
                    def = 64.0D;
                    hp = 100.0D;
                } else if (Intrinsics.areEqual(pkm, "Weepinbell")) {
                    atk = 172.0D;
                    def = 95.0D;
                    hp = 130.0D;
                } else if (Intrinsics.areEqual(pkm, "Victreebel")) {
                    atk = 207.0D;
                    def = 138.0D;
                    hp = 160.0D;
                } else if (Intrinsics.areEqual(pkm, "Tentacool")) {
                    atk = 97.0D;
                    def = 182.0D;
                    hp = 80.0D;
                } else if (Intrinsics.areEqual(pkm, "Tentacruel")) {
                    atk = 166.0D;
                    def = 237.0D;
                    hp = 160.0D;
                } else if (Intrinsics.areEqual(pkm, "Geodude")) {
                    atk = 132.0D;
                    def = 163.0D;
                    hp = 80.0D;
                } else if (Intrinsics.areEqual(pkm, "Graveler")) {
                    atk = 164.0D;
                    def = 196.0D;
                    hp = 110.0D;
                } else if (Intrinsics.areEqual(pkm, "Golem")) {
                    atk = 211.0D;
                    def = 229.0D;
                    hp = 160.0D;
                } else if (Intrinsics.areEqual(pkm, "Ponyta")) {
                    atk = 170.0D;
                    def = 132.0D;
                    hp = 100.0D;
                } else if (Intrinsics.areEqual(pkm, "Rapidash")) {
                    atk = 207.0D;
                    def = 167.0D;
                    hp = 130.0D;
                } else if (Intrinsics.areEqual(pkm, "Slowpoke")) {
                    atk = 109.0D;
                    def = 109.0D;
                    hp = 180.0D;
                } else if (Intrinsics.areEqual(pkm, "Slowbro")) {
                    atk = 177.0D;
                    def = 194.0D;
                    hp = 190.0D;
                } else if (Intrinsics.areEqual(pkm, "Magnemite")) {
                    atk = 165.0D;
                    def = 128.0D;
                    hp = 50.0D;
                } else if (Intrinsics.areEqual(pkm, "Magneton")) {
                    atk = 223.0D;
                    def = 182.0D;
                    hp = 100.0D;
                } else if (Intrinsics.areEqual(pkm, "Farfetchd")) {
                    atk = 124.0D;
                    def = 118.0D;
                    hp = 104.0D;
                } else if (Intrinsics.areEqual(pkm, "Doduo")) {
                    atk = 158.0D;
                    def = 88.0D;
                    hp = 70.0D;
                } else if (Intrinsics.areEqual(pkm, "Dodrio")) {
                    atk = 218.0D;
                    def = 145.0D;
                    hp = 120.0D;
                } else if (Intrinsics.areEqual(pkm, "Seel")) {
                    atk = 85.0D;
                    def = 128.0D;
                    hp = 130.0D;
                } else if (Intrinsics.areEqual(pkm, "Dewgong")) {
                    atk = 139.0D;
                    def = 184.0D;
                    hp = 180.0D;
                } else if (Intrinsics.areEqual(pkm, "Grimer")) {
                    atk = 135.0D;
                    def = 90.0D;
                    hp = 160.0D;
                } else if (Intrinsics.areEqual(pkm, "Muk")) {
                    atk = 190.0D;
                    def = 184.0D;
                    hp = 210.0D;
                } else if (Intrinsics.areEqual(pkm, "Shellder")) {
                    atk = 116.0D;
                    def = 168.0D;
                    hp = 60.0D;
                } else if (Intrinsics.areEqual(pkm, "Cloyster")) {
                    atk = 186.0D;
                    def = 323.0D;
                    hp = 100.0D;
                } else if (Intrinsics.areEqual(pkm, "Gastly")) {
                    atk = 186.0D;
                    def = 70.0D;
                    hp = 60.0D;
                } else if (Intrinsics.areEqual(pkm, "Haunter")) {
                    atk = 223.0D;
                    def = 112.0D;
                    hp = 90.0D;
                } else if (Intrinsics.areEqual(pkm, "Gengar")) {
                    atk = 261.0D;
                    def = 156.0D;
                    hp = 120.0D;
                } else if (Intrinsics.areEqual(pkm, "Onix")) {
                    atk = 85.0D;
                    def = 288.0D;
                    hp = 70.0D;
                } else if (Intrinsics.areEqual(pkm, "Drowzee")) {
                    atk = 89.0D;
                    def = 158.0D;
                    hp = 120.0D;
                } else if (Intrinsics.areEqual(pkm, "Hypno")) {
                    atk = 144.0D;
                    def = 215.0D;
                    hp = 170.0D;
                } else if (Intrinsics.areEqual(pkm, "Krabby")) {
                    atk = 181.0D;
                    def = 156.0D;
                    hp = 60.0D;
                } else if (Intrinsics.areEqual(pkm, "Kingler")) {
                    atk = 240.0D;
                    def = 214.0D;
                    hp = 110.0D;
                } else if (Intrinsics.areEqual(pkm, "Voltorb")) {
                    atk = 109.0D;
                    def = 114.0D;
                    hp = 80.0D;
                } else if (Intrinsics.areEqual(pkm, "Electrode")) {
                    atk = 173.0D;
                    def = 179.0D;
                    hp = 120.0D;
                } else if (Intrinsics.areEqual(pkm, "Exeggcute")) {
                    atk = 107.0D;
                    def = 140.0D;
                    hp = 120.0D;
                } else if (Intrinsics.areEqual(pkm, "Exeggutor")) {
                    atk = 233.0D;
                    def = 158.0D;
                    hp = 190.0D;
                } else if (Intrinsics.areEqual(pkm, "Cubone")) {
                    atk = 90.0D;
                    def = 165.0D;
                    hp = 100.0D;
                } else if (Intrinsics.areEqual(pkm, "Marowak")) {
                    atk = 144.0D;
                    def = 200.0D;
                    hp = 120.0D;
                } else if (Intrinsics.areEqual(pkm, "Hitmonlee")) {
                    atk = 224.0D;
                    def = 211.0D;
                    hp = 100.0D;
                } else if (Intrinsics.areEqual(pkm, "Hitmonchan")) {
                    atk = 193.0D;
                    def = 212.0D;
                    hp = 100.0D;
                } else if (Intrinsics.areEqual(pkm, "Lickitung")) {
                    atk = 108.0D;
                    def = 137.0D;
                    hp = 180.0D;
                } else if (Intrinsics.areEqual(pkm, "Koffing")) {
                    atk = 119.0D;
                    def = 164.0D;
                    hp = 80.0D;
                } else if (Intrinsics.areEqual(pkm, "Weezing")) {
                    atk = 174.0D;
                    def = 221.0D;
                    hp = 130.0D;
                } else if (Intrinsics.areEqual(pkm, "Rhyhorn")) {
                    atk = 140.0D;
                    def = 157.0D;
                    hp = 160.0D;
                } else if (Intrinsics.areEqual(pkm, "Rhydon")) {
                    atk = 222.0D;
                    def = 206.0D;
                    hp = 210.0D;
                } else if (Intrinsics.areEqual(pkm, "Chansey")) {
                    atk = 60.0D;
                    def = 176.0D;
                    hp = 500.0D;
                } else if (Intrinsics.areEqual(pkm, "Tangela")) {
                    atk = 183.0D;
                    def = 205.0D;
                    hp = 130.0D;
                } else if (Intrinsics.areEqual(pkm, "kangaskhan")) {
                    atk = 181.0D;
                    def = 165.0D;
                    hp = 210.0D;
                } else if (Intrinsics.areEqual(pkm, "Horsea")) {
                    atk = 129.0D;
                    def = 125.0D;
                    hp = 60.0D;
                } else if (Intrinsics.areEqual(pkm, "Seadra")) {
                    atk = 187.0D;
                    def = 182.0D;
                    hp = 110.0D;
                } else if (Intrinsics.areEqual(pkm, "Goldeen")) {
                    atk = 123.0D;
                    def = 115.0D;
                    hp = 90.0D;
                } else if (Intrinsics.areEqual(pkm, "Seaking")) {
                    atk = 175.0D;
                    def = 154.0D;
                    hp = 160.0D;
                } else if (Intrinsics.areEqual(pkm, "Staryu")) {
                    atk = 137.0D;
                    def = 112.0D;
                    hp = 60.0D;
                } else if (Intrinsics.areEqual(pkm, "Starmie")) {
                    atk = 210.0D;
                    def = 184.0D;
                    hp = 120.0D;
                } else if (Intrinsics.areEqual(pkm, "MR.Mime")) {
                    atk = 192.0D;
                    def = 233.0D;
                    hp = 80.0D;
                } else if (Intrinsics.areEqual(pkm, "Scyther")) {
                    atk = 218.0D;
                    def = 170.0D;
                    hp = 140.0D;
                } else if (Intrinsics.areEqual(pkm, "Jynx")) {
                    atk = 223.0D;
                    def = 182.0D;
                    hp = 130.0D;
                } else if (Intrinsics.areEqual(pkm, "Electabuzz")) {
                    atk = 198.0D;
                    def = 173.0D;
                    hp = 130.0D;
                } else if (Intrinsics.areEqual(pkm, "Magmar")) {
                    atk = 206.0D;
                    def = 169.0D;
                    hp = 130.0D;
                } else if (Intrinsics.areEqual(pkm, "Pinsir")) {
                    atk = 238.0D;
                    def = 197.0D;
                    hp = 130.0D;
                } else if (Intrinsics.areEqual(pkm, "Tauros")) {
                    atk = 198.0D;
                    def = 197.0D;
                    hp = 150.0D;
                } else if (Intrinsics.areEqual(pkm, "Magikarp")) {
                    atk = 29.0D;
                    def = 102.0D;
                    hp = 40.0D;
                } else if (Intrinsics.areEqual(pkm, "Gyarados")) {
                    atk = 237.0D;
                    def = 197.0D;
                    hp = 190.0D;
                } else if (Intrinsics.areEqual(pkm, "Lapras")) {
                    atk = 165.0D;
                    def = 180.0D;
                    hp = 260.0D;
                } else if (Intrinsics.areEqual(pkm, "Ditto")) {
                    atk = 91.0D;
                    def = 91.0D;
                    hp = 96.0D;
                } else if (Intrinsics.areEqual(pkm, "Eevee")) {
                    atk = 104.0D;
                    def = 121.0D;
                    hp = 110.0D;
                } else if (Intrinsics.areEqual(pkm, "Vaporeon")) {
                    atk = 205.0D;
                    def = 177.0D;
                    hp = 260.0D;
                } else if (Intrinsics.areEqual(pkm, "Jolteon")) {
                    atk = 232.0D;
                    def = 201.0D;
                    hp = 130.0D;
                } else if (Intrinsics.areEqual(pkm, "Flareon")) {
                    atk = 246.0D;
                    def = 204.0D;
                    hp = 130.0D;
                } else if (Intrinsics.areEqual(pkm, "Porygon")) {
                    atk = 153.0D;
                    def = 139.0D;
                    hp = 130.0D;
                } else if (Intrinsics.areEqual(pkm, "Omanyte")) {
                    atk = 155.0D;
                    def = 174.0D;
                    hp = 70.0D;
                } else if (Intrinsics.areEqual(pkm, "Omastar")) {
                    atk = 207.0D;
                    def = 227.0D;
                    hp = 140.0D;
                } else if (Intrinsics.areEqual(pkm, "Kabuto")) {
                    atk = 148.0D;
                    def = 162.0D;
                    hp = 60.0D;
                } else if (Intrinsics.areEqual(pkm, "Kabutops")) {
                    atk = 220.0D;
                    def = 203.0D;
                    hp = 120.0D;
                } else if (Intrinsics.areEqual(pkm, "Aerodactyl")) {
                    atk = 221.0D;
                    def = 164.0D;
                    hp = 160.0D;
                } else if (Intrinsics.areEqual(pkm, "Snorlax")) {
                    atk = 190.0D;
                    def = 190.0D;
                    hp = 320.0D;
                } else if (Intrinsics.areEqual(pkm, "Articuno")) {
                    atk = 192.0D;
                    def = 249.0D;
                    hp = 180.0D;
                } else if (Intrinsics.areEqual(pkm, "Zapdos")) {
                    atk = 253.0D;
                    def = 188.0D;
                    hp = 180.0D;
                } else if (Intrinsics.areEqual(pkm, "Moltres")) {
                    atk = 251.0D;
                    def = 184.0D;
                    hp = 180.0D;
                } else if (Intrinsics.areEqual(pkm, "Dratini")) {
                    atk = 119.0D;
                    def = 94.0D;
                    hp = 82.0D;
                } else if (Intrinsics.areEqual(pkm, "Dragonair")) {
                    atk = 163.0D;
                    def = 138.0D;
                    hp = 122.0D;
                } else if (Intrinsics.areEqual(pkm, "Dragonite")) {
                    atk = 263.0D;
                    def = 201.0D;
                    hp = 182.0D;
                } else if (Intrinsics.areEqual(pkm, "Mewtwo")) {
                    atk = 300.0D;
                    def = 182.0D;
                    hp = 192.0D;
                } else if (Intrinsics.areEqual(pkm, "Mew")) {
                    atk = 210.0D;
                    def = 210.0D;
                    hp = 200.0D;
                } else if (Intrinsics.areEqual(pkm, "Chikorita")) {
                    atk = 92.0D;
                    def = 122.0D;
                    hp = 90.0D;
                } else if (Intrinsics.areEqual(pkm, "Bayleef")) {
                    atk = 122.0D;
                    def = 155.0D;
                    hp = 120.0D;
                } else if (Intrinsics.areEqual(pkm, "Meganium")) {
                    atk = 168.0D;
                    def = 202.0D;
                    hp = 160.0D;
                } else if (Intrinsics.areEqual(pkm, "Cyndaquil")) {
                    atk = 116.0D;
                    def = 96.0D;
                    hp = 78.0D;
                } else if (Intrinsics.areEqual(pkm, "Quilava")) {
                    atk = 158.0D;
                    def = 129.0D;
                    hp = 116.0D;
                } else if (Intrinsics.areEqual(pkm, "Typhlosion")) {
                    atk = 223.0D;
                    def = 176.0D;
                    hp = 156.0D;
                } else if (Intrinsics.areEqual(pkm, "Totodile")) {
                    atk = 117.0D;
                    def = 116.0D;
                    hp = 100.0D;
                } else if (Intrinsics.areEqual(pkm, "Croconaw")) {
                    atk = 150.0D;
                    def = 151.0D;
                    hp = 130.0D;
                } else if (Intrinsics.areEqual(pkm, "Feraligatr")) {
                    atk = 205.0D;
                    def = 197.0D;
                    hp = 170.0D;
                } else if (Intrinsics.areEqual(pkm, "Sentret")) {
                    atk = 79.0D;
                    def = 77.0D;
                    hp = 70.0D;
                } else if (Intrinsics.areEqual(pkm, "Furret")) {
                    atk = 148.0D;
                    def = 130.0D;
                    hp = 170.0D;
                } else if (Intrinsics.areEqual(pkm, "Hoothoot")) {
                    atk = 67.0D;
                    def = 101.0D;
                    hp = 120.0D;
                } else if (Intrinsics.areEqual(pkm, "Noctowl")) {
                    atk = 145.0D;
                    def = 179.0D;
                    hp = 200.0D;
                } else if (Intrinsics.areEqual(pkm, "Ledyba")) {
                    atk = 72.0D;
                    def = 142.0D;
                    hp = 80.0D;
                } else if (Intrinsics.areEqual(pkm, "Ledian")) {
                    atk = 107.0D;
                    def = 209.0D;
                    hp = 110.0D;
                } else if (Intrinsics.areEqual(pkm, "Spinarak")) {
                    atk = 105.0D;
                    def = 73.0D;
                    hp = 80.0D;
                } else if (Intrinsics.areEqual(pkm, "Ariados")) {
                    atk = 161.0D;
                    def = 128.0D;
                    hp = 140.0D;
                } else if (Intrinsics.areEqual(pkm, "Crobat")) {
                    atk = 194.0D;
                    def = 178.0D;
                    hp = 170.0D;
                } else if (Intrinsics.areEqual(pkm, "Chinchou")) {
                    atk = 106.0D;
                    def = 106.0D;
                    hp = 150.0D;
                } else if (Intrinsics.areEqual(pkm, "Lanturn")) {
                    atk = 146.0D;
                    def = 146.0D;
                    hp = 250.0D;
                } else if (Intrinsics.areEqual(pkm, "Pichu")) {
                    atk = 77.0D;
                    def = 63.0D;
                    hp = 40.0D;
                } else if (Intrinsics.areEqual(pkm, "Cleffa")) {
                    atk = 75.0D;
                    def = 91.0D;
                    hp = 100.0D;
                } else if (Intrinsics.areEqual(pkm, "Igglybuff")) {
                    atk = 69.0D;
                    def = 34.0D;
                    hp = 180.0D;
                } else if (Intrinsics.areEqual(pkm, "Togepi")) {
                    atk = 67.0D;
                    def = 116.0D;
                    hp = 70.0D;
                } else if (Intrinsics.areEqual(pkm, "Togetic")) {
                    atk = 139.0D;
                    def = 191.0D;
                    hp = 110.0D;
                } else if (Intrinsics.areEqual(pkm, "Natu")) {
                    atk = 134.0D;
                    def = 89.0D;
                    hp = 80.0D;
                } else if (Intrinsics.areEqual(pkm, "Xatu")) {
                    atk = 192.0D;
                    def = 146.0D;
                    hp = 130.0D;
                } else if (Intrinsics.areEqual(pkm, "Mareep")) {
                    atk = 114.0D;
                    def = 82.0D;
                    hp = 110.0D;
                } else if (Intrinsics.areEqual(pkm, "Flaaffy")) {
                    atk = 145.0D;
                    def = 112.0D;
                    hp = 140.0D;
                } else if (Intrinsics.areEqual(pkm, "Ampharos")) {
                    atk = 211.0D;
                    def = 172.0D;
                    hp = 180.0D;
                } else if (Intrinsics.areEqual(pkm, "Bellossom")) {
                    atk = 169.0D;
                    def = 189.0D;
                    hp = 150.0D;
                } else if (Intrinsics.areEqual(pkm, "Marill")) {
                    atk = 37.0D;
                    def = 93.0D;
                    hp = 140.0D;
                } else if (Intrinsics.areEqual(pkm, "Azumarill")) {
                    atk = 112.0D;
                    def = 152.0D;
                    hp = 200.0D;
                } else if (Intrinsics.areEqual(pkm, "Sudowoodo")) {
                    atk = 167.0D;
                    def = 198.0D;
                    hp = 140.0D;
                } else if (Intrinsics.areEqual(pkm, "Politoed")) {
                    atk = 174.0D;
                    def = 192.0D;
                    hp = 180.0D;
                } else if (Intrinsics.areEqual(pkm, "Hoppip")) {
                    atk = 67.0D;
                    def = 101.0D;
                    hp = 70.0D;
                } else if (Intrinsics.areEqual(pkm, "Skiploom")) {
                    atk = 91.0D;
                    def = 127.0D;
                    hp = 110.0D;
                } else if (Intrinsics.areEqual(pkm, "Jumpluff")) {
                    atk = 118.0D;
                    def = 197.0D;
                    hp = 150.0D;
                } else if (Intrinsics.areEqual(pkm, "Aipom")) {
                    atk = 136.0D;
                    def = 112.0D;
                    hp = 110.0D;
                } else if (Intrinsics.areEqual(pkm, "Sunkern")) {
                    atk = 55.0D;
                    def = 55.0D;
                    hp = 60.0D;
                } else if (Intrinsics.areEqual(pkm, "Sunflora")) {
                    atk = 185.0D;
                    def = 148.0D;
                    hp = 150.0D;
                } else if (Intrinsics.areEqual(pkm, "Yanma")) {
                    atk = 154.0D;
                    def = 94.0D;
                    hp = 130.0D;
                } else if (Intrinsics.areEqual(pkm, "Wooper")) {
                    atk = 75.0D;
                    def = 75.0D;
                    hp = 110.0D;
                } else if (Intrinsics.areEqual(pkm, "Quagsire")) {
                    atk = 152.0D;
                    def = 152.0D;
                    hp = 190.0D;
                } else if (Intrinsics.areEqual(pkm, "Espeon")) {
                    atk = 261.0D;
                    def = 194.0D;
                    hp = 130.0D;
                } else if (Intrinsics.areEqual(pkm, "Umbreon")) {
                    atk = 126.0D;
                    def = 250.0D;
                    hp = 190.0D;
                } else if (Intrinsics.areEqual(pkm, "Murkrow")) {
                    atk = 175.0D;
                    def = 87.0D;
                    hp = 120.0D;
                } else if (Intrinsics.areEqual(pkm, "Slowking")) {
                    atk = 177.0D;
                    def = 194.0D;
                    hp = 190.0D;
                } else if (Intrinsics.areEqual(pkm, "Unown")) {
                    atk = 136.0D;
                    def = 91.0D;
                    hp = 96.0D;
                } else if (Intrinsics.areEqual(pkm, "Wobbuffet")) {
                    atk = 60.0D;
                    def = 106.0D;
                    hp = 380.0D;
                } else if (Intrinsics.areEqual(pkm, "Girafarig")) {
                    atk = 182.0D;
                    def = 133.0D;
                    hp = 140.0D;
                } else if (Intrinsics.areEqual(pkm, "Pineco")) {
                    atk = 108.0D;
                    def = 146.0D;
                    hp = 100.0D;
                } else if (Intrinsics.areEqual(pkm, "Forretress")) {
                    atk = 161.0D;
                    def = 242.0D;
                    hp = 150.0D;
                } else if (Intrinsics.areEqual(pkm, "Dunsparce")) {
                    atk = 131.0D;
                    def = 131.0D;
                    hp = 200.0D;
                } else if (Intrinsics.areEqual(pkm, "Gligar")) {
                    atk = 143.0D;
                    def = 204.0D;
                    hp = 130.0D;
                } else if (Intrinsics.areEqual(pkm, "Steelix")) {
                    atk = 148.0D;
                    def = 333.0D;
                    hp = 150.0D;
                } else if (Intrinsics.areEqual(pkm, "Snubbull")) {
                    atk = 137.0D;
                    def = 89.0D;
                    hp = 120.0D;
                } else if (Intrinsics.areEqual(pkm, "Granbull")) {
                    atk = 212.0D;
                    def = 137.0D;
                    hp = 180.0D;
                } else if (Intrinsics.areEqual(pkm, "Quilfish")) {
                    atk = 184.0D;
                    def = 148.0D;
                    hp = 130.0D;
                } else if (Intrinsics.areEqual(pkm, "Scizor")) {
                    atk = 236.0D;
                    def = 191.0D;
                    hp = 140.0D;
                } else if (Intrinsics.areEqual(pkm, "Shuckle")) {
                    atk = 17.0D;
                    def = 396.0D;
                    hp = 40.0D;
                } else if (Intrinsics.areEqual(pkm, "Heracross")) {
                    atk = 234.0D;
                    def = 189.0D;
                    hp = 160.0D;
                } else if (Intrinsics.areEqual(pkm, "Sneasel")) {
                    atk = 189.0D;
                    def = 157.0D;
                    hp = 110.0D;
                } else if (Intrinsics.areEqual(pkm, "Teddiursa")) {
                    atk = 142.0D;
                    def = 93.0D;
                    hp = 120.0D;
                } else if (Intrinsics.areEqual(pkm, "Ursaring")) {
                    atk = 236.0D;
                    def = 144.0D;
                    hp = 180.0D;
                } else if (Intrinsics.areEqual(pkm, "Slugma")) {
                    atk = 118.0D;
                    def = 71.0D;
                    hp = 80.0D;
                } else if (Intrinsics.areEqual(pkm, "Magcargo")) {
                    atk = 139.0D;
                    def = 209.0D;
                    hp = 100.0D;
                } else if (Intrinsics.areEqual(pkm, "Swinub")) {
                    atk = 90.0D;
                    def = 74.0D;
                    hp = 100.0D;
                } else if (Intrinsics.areEqual(pkm, "Piloswine")) {
                    atk = 181.0D;
                    def = 147.0D;
                    hp = 200.0D;
                } else if (Intrinsics.areEqual(pkm, "Corsola")) {
                    atk = 118.0D;
                    def = 156.0D;
                    hp = 110.0D;
                } else if (Intrinsics.areEqual(pkm, "Remoraid")) {
                    atk = 127.0D;
                    def = 69.0D;
                    hp = 70.0D;
                } else if (Intrinsics.areEqual(pkm, "Octillery")) {
                    atk = 197.0D;
                    def = 141.0D;
                    hp = 150.0D;
                } else if (Intrinsics.areEqual(pkm, "Delibird")) {
                    atk = 128.0D;
                    def = 90.0D;
                    hp = 90.0D;
                } else if (Intrinsics.areEqual(pkm, "Mantine")) {
                    atk = 148.0D;
                    def = 260.0D;
                    hp = 130.0D;
                } else if (Intrinsics.areEqual(pkm, "Skarmory")) {
                    atk = 148.0D;
                    def = 260.0D;
                    hp = 130.0D;
                } else if (Intrinsics.areEqual(pkm, "Houndour")) {
                    atk = 152.0D;
                    def = 93.0D;
                    hp = 90.0D;
                } else if (Intrinsics.areEqual(pkm, "Houndoom")) {
                    atk = 224.0D;
                    def = 159.0D;
                    hp = 150.0D;
                } else if (Intrinsics.areEqual(pkm, "Kingdra")) {
                    atk = 194.0D;
                    def = 194.0D;
                    hp = 150.0D;
                } else if (Intrinsics.areEqual(pkm, "Phanpy")) {
                    atk = 107.0D;
                    def = 107.0D;
                    hp = 180.0D;
                } else if (Intrinsics.areEqual(pkm, "Donphan")) {
                    atk = 214.0D;
                    def = 214.0D;
                    hp = 180.0D;
                } else if (Intrinsics.areEqual(pkm, "Porygon2")) {
                    atk = 198.0D;
                    def = 183.0D;
                    hp = 170.0D;
                } else if (Intrinsics.areEqual(pkm, "Stantler")) {
                    atk = 192.0D;
                    def = 132.0D;
                    hp = 146.0D;
                } else if (Intrinsics.areEqual(pkm, "Smeargle")) {
                    atk = 40.0D;
                    def = 88.0D;
                    hp = 110.0D;
                } else if (Intrinsics.areEqual(pkm, "Tyrogue")) {
                    atk = 64.0D;
                    def = 64.0D;
                    hp = 70.0D;
                } else if (Intrinsics.areEqual(pkm, "Hitmontop")) {
                    atk = 173.0D;
                    def = 214.0D;
                    hp = 100.0D;
                } else if (Intrinsics.areEqual(pkm, "Smoochum")) {
                    atk = 153.0D;
                    def = 116.0D;
                    hp = 90.0D;
                } else if (Intrinsics.areEqual(pkm, "Elekid")) {
                    atk = 135.0D;
                    def = 110.0D;
                    hp = 90.0D;
                } else if (Intrinsics.areEqual(pkm, "Magby")) {
                    atk = 151.0D;
                    def = 108.0D;
                    hp = 90.0D;
                } else if (Intrinsics.areEqual(pkm, "Miltank")) {
                    atk = 157.0D;
                    def = 211.0D;
                    hp = 190.0D;
                } else if (Intrinsics.areEqual(pkm, "Blissey")) {
                    atk = 129.0D;
                    def = 229.0D;
                    hp = 510.0D;
                } else if (Intrinsics.areEqual(pkm, "Raikou")) {
                    atk = 241.0D;
                    def = 210.0D;
                    hp = 180.0D;
                } else if (Intrinsics.areEqual(pkm, "Entei")) {
                    atk = 235.0D;
                    def = 176.0D;
                    hp = 230.0D;
                } else if (Intrinsics.areEqual(pkm, "Suicune")) {
                    atk = 180.0D;
                    def = 235.0D;
                    hp = 200.0D;
                } else if (Intrinsics.areEqual(pkm, "Larvitar")) {
                    atk = 115.0D;
                    def = 93.0D;
                    hp = 100.0D;
                } else if (Intrinsics.areEqual(pkm, "Pupitar")) {
                    atk = 155.0D;
                    def = 133.0D;
                    hp = 140.0D;
                } else if (Intrinsics.areEqual(pkm, "Tyranitar")) {
                    atk = 251.0D;
                    def = 212.0D;
                    hp = 200.0D;
                } else if (Intrinsics.areEqual(pkm, "Lugia")) {
                    atk = 193.0D;
                    def = 323.0D;
                    hp = 212.0D;
                } else if (Intrinsics.areEqual(pkm, "Ho-oh")) {
                    atk = 263.0D;
                    def = 301.0D;
                    hp = 212.0D;
                } else {
                    if (!Intrinsics.areEqual(pkm, "Celebi")) {
                        break;
                    }

                    atk = 210.0D;
                    def = 210.0D;
                    hp = 200.0D;
                }

                iva = 0.0D;

                for(percent = 0.0D; iva <= (double)15; ++iva) {
                    for(ivd = 0.0D; ivd <= (double)15; ++ivd) {
                        for(ivh = 0.0D; ivh <= (double)15; ++ivh) {
                            for(lvl = 1; lvl < 40; ++lvl) {
                                cp = cpformula(atk + iva, def + ivd, hp + ivh, cpm[lvl - 1]);
                                if (cp < (double)10) {
                                    cp = 10.0D;
                                }

                                if ((int)cp == CP && percent < (iva + ivd + ivh) / 45.0D * 100.0D) {
                                    percent = (iva + ivd + ivh) / 45.0D * 100.0D;
                                    l = lvl;
                                }
                            }
                        }
                    }
                }

                var22 = "Your " + pkm + " can be " + (int)percent + "% at level " + l + " CP:" + CP + "\n";
                show_Iv.setText(var22);
            } while(CP != 0);

        }
    }

    private static double cpformula(double atk, double def, double hp, double cpm) {
        return atk * Math.pow(def, 0.5D) * Math.pow(hp, 0.5D) * Math.pow(cpm, 2.0D) / (double)10;
    }
}