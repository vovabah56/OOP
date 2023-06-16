import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
//              1Football manchester
        Team manchester = new Team("Manchester", "img/Manchester.png", "Основан в 1894");

        Player manuelAkanji = new Player("Manuel Akanji", new Football(), 45, manchester);
        manchester.addPlayerByName(manuelAkanji);
        Player nathanAke = new Player("Nathan Ake", new Football(), 26, manchester);
        manchester.addPlayerByName(nathanAke);
        Player joaoCancelo = new Player("Joao Cancelo", new Football(), 30, manchester);
        manchester.addPlayerByName(joaoCancelo);
        Player rubenDias = new Player("Ruben Dias", new Football(), 24, manchester);
        manchester.addPlayerByName(rubenDias);
        Player sergioGomez = new Player("Sergio Gomez", new Football(), 30, manchester);
        manchester.addPlayerByName(sergioGomez);
        Player aymericLaporte = new Player("Aymeric Laporte", new Football(), 55, manchester);
        manchester.addPlayerByName(aymericLaporte);
        Player ricoLewis = new Player("Rico Lewis", new Football(), 25, manchester);
        manchester.addPlayerByName(ricoLewis);
        Player julianAlvarez = new Player("Julian Alvarez", new Football(), 26, manchester);
        manchester.addPlayerByName(julianAlvarez);
        Player ederson = new Player("Ederson", new Football(), 33, manchester);
        manchester.addPlayerByName(ederson);
        Player scottCarson = new Player("Scott Carson", new Football(), 27, manchester);
        manchester.addPlayerByName(scottCarson);
        Player rodrigo = new Player("Rodrigo", new Football(), 49, manchester);
        manchester.addPlayerByName(rodrigo);

//              2Football Spartak
        Team spartak = new Team("Spartak", "img/Spartak.png", "Основан в 1922");

        Player antonShitov = new Player("Anton Shitov", new Football(), 15, spartak);
        spartak.addPlayerByName(antonShitov);
        Player aleksandrSelikhov = new Player("Aleksandr Selikhov", new Football(), 24, spartak);
        spartak.addPlayerByName(aleksandrSelikhov);
        Player alexisDuarte = new Player("Alexis Duarte", new Football(), 55, spartak);
        spartak.addPlayerByName(alexisDuarte);
        Player leonKlassen = new Player("Leon Klassen", new Football(), 32, spartak);
        spartak.addPlayerByName(leonKlassen);
        Player georgiDzhikiya = new Player("Georgi Dzhikiya", new Football(), 33, spartak);
        spartak.addPlayerByName(georgiDzhikiya);
        Player tomasTavares = new Player("Tomas Tavares", new Football(), 35, spartak);
        spartak.addPlayerByName(tomasTavares);
        Player pavelMaslov = new Player("Pavel Maslov", new Football(), 14, spartak);
        spartak.addPlayerByName(pavelMaslov);
        Player nikitaChernov = new Player("Nikita Chernov", new Football(), 36, spartak);
        spartak.addPlayerByName(nikitaChernov);
        Player victorMoses = new Player("Victor Moses", new Football(), 41, spartak);
        spartak.addPlayerByName(victorMoses);
        Player maciejRybus = new Player("Maciej Rybus", new Football(), 53, spartak);
        spartak.addPlayerByName(maciejRybus);
        Player nailUmyarov = new Player("Nail Umyarov", new Football(), 19, spartak);
        spartak.addPlayerByName(nailUmyarov);

//         3Football Krylya Sovetov
        Team krylyaSovetov = new Team("Krylya Sovetov", "img/KrylyaSovetov.png", "Основан в 1947");

        Player ivanLomaev = new Player("Ivan Lomaev", new Football(), 47, krylyaSovetov);
        krylyaSovetov.addPlayerByName(ivanLomaev);
        Player bogdanOvsyannikov = new Player("Bogdan Ovsyannikov", new Football(), 54, krylyaSovetov);
        krylyaSovetov.addPlayerByName(bogdanOvsyannikov);
        Player evgeniyFrolov = new Player("Evgeniy Frolov", new Football(), 16, krylyaSovetov);
        krylyaSovetov.addPlayerByName(evgeniyFrolov);
        Player romanEvgenjev = new Player("Roman Evgenjev", new Football(), 37, krylyaSovetov);
        krylyaSovetov.addPlayerByName(romanEvgenjev);
        Player aleksandrSoldatenkov = new Player("Aleksandr Soldatenkov", new Football(), 18, krylyaSovetov);
        krylyaSovetov.addPlayerByName(aleksandrSoldatenkov);
        Player ilyaGaponov = new Player("Ilya Gaponov", new Football(), 28, krylyaSovetov);
        krylyaSovetov.addPlayerByName(ilyaGaponov);
        Player yuriyGorshkov = new Player("Yuriy Gorshkov", new Football(), 34, krylyaSovetov);
        krylyaSovetov.addPlayerByName(yuriyGorshkov);
        Player glennBijl = new Player("Glenn Bijl", new Football(), 43, krylyaSovetov);
        krylyaSovetov.addPlayerByName(glennBijl);
        Player fernandoCostanza = new Player("Fernando Costanza", new Football(), 50, krylyaSovetov);
        krylyaSovetov.addPlayerByName(fernandoCostanza);
        Player maksimVityugov = new Player("Maksim Vityugov", new Football(), 17, krylyaSovetov);
        krylyaSovetov.addPlayerByName(maksimVityugov);
        Player amarRahmanovic = new Player("Amar Rahmanovic", new Football(), 54, krylyaSovetov);
        krylyaSovetov.addPlayerByName(amarRahmanovic);

//        4Football Orenburg
        Team orenburg = new Team("Orenburg", "img/Orenburg.png", "Основан в 1976");

        Player nikolaySysuev = new Player("Nikolay Sysuev", new Football(), 30, orenburg);
        orenburg.addPlayerByName(nikolaySysuev);
        Player alekseyKenyaykin = new Player("Aleksey Kenyaykin", new Football(), 14, orenburg);
        orenburg.addPlayerByName(alekseyKenyaykin);
        Player evgeniyGoshev = new Player("Evgeniy Goshev", new Football(), 15, orenburg);
        orenburg.addPlayerByName(evgeniyGoshev);
        Player renatoGojkovic = new Player("Renato Gojkovic", new Football(), 38, orenburg);
        orenburg.addPlayerByName(renatoGojkovic);
        Player matiasPerez = new Player("Matías Pérez", new Football(), 46, orenburg);
        orenburg.addPlayerByName(matiasPerez);
        Player danilaKhotulev = new Player("Danila Khotulev", new Football(), 56, orenburg);
        orenburg.addPlayerByName(danilaKhotulev);
        Player mikhailSivakov = new Player("Mikhail Sivakov", new Football(), 35, orenburg);
        orenburg.addPlayerByName(mikhailSivakov);
        Player mateoStamatov = new Player("Mateo Stamatov", new Football(), 48, orenburg);
        orenburg.addPlayerByName(mateoStamatov);
        Player vladimirPoluyakhtov = new Player("Vladimir Poluyakhtov", new Football(), 16, orenburg);
        orenburg.addPlayerByName(vladimirPoluyakhtov);
        Player andreyMalykh = new Player("Andrey Malykh", new Football(), 44, orenburg);
        orenburg.addPlayerByName(andreyMalykh);
        Player aleksandrEktov = new Player("Aleksandr Ektov", new Football(), 26, orenburg);
        orenburg.addPlayerByName(aleksandrEktov);

//        5Football KamAZ
        Team kamAZ = new Team("KamAZ", "img/KamAZ.png", "Основан в 1969");

        Player alekseyMamin = new Player("Aleksey Mamin", new Football(), 20, kamAZ);
        kamAZ.addPlayerByName(alekseyMamin);
        Player alekseySmirnov = new Player("Aleksey Smirnov", new Football(), 25, kamAZ);
        kamAZ.addPlayerByName(alekseySmirnov);
        Player vladislavVasiljev = new Player("Vladislav Vasiljev", new Football(), 41, kamAZ);
        kamAZ.addPlayerByName(vladislavVasiljev);
        Player alekseyGerasimov = new Player("Aleksey Gerasimov", new Football(), 15, kamAZ);
        kamAZ.addPlayerByName(alekseyGerasimov);
        Player nikolayTolstopyatov = new Player("Nikolay Tolstopyatov", new Football(), 36, kamAZ);
        kamAZ.addPlayerByName(nikolayTolstopyatov);
        Player antonPolyutkin = new Player("Anton Polyutkin", new Football(), 44, kamAZ);
        kamAZ.addPlayerByName(antonPolyutkin);
        Player aleksandrKulikov = new Player("Aleksandr Kulikov", new Football(), 19, kamAZ);
        kamAZ.addPlayerByName(aleksandrKulikov);
        Player amirMokhammad = new Player("Amir Mokhammad", new Football(), 26, kamAZ);
        kamAZ.addPlayerByName(amirMokhammad);
        Player valentinPaltsev = new Player("Valentin Paltsev", new Football(), 35, kamAZ);
        kamAZ.addPlayerByName(valentinPaltsev);
        Player ruslanAyukin = new Player("Ruslan Ayukin", new Football(), 40, kamAZ);
        kamAZ.addPlayerByName(ruslanAyukin);
        Player dinarShaykhutdinov = new Player("Dinar Shaykhutdinov", new Football(), 18, kamAZ);
        kamAZ.addPlayerByName(dinarShaykhutdinov);

//        6Football Torpedo
        Team torpedo = new Team("Torpedo", "img/Torpedo.png", "Основан в 1924");

        Player vitaliyBotnar = new Player("Vitaliy Botnar", new Football(), 51, torpedo);
        torpedo.addPlayerByName(vitaliyBotnar);
        Player yuriyZhuravlev = new Player("Yuriy Zhuravlev", new Football(), 42, torpedo);
        torpedo.addPlayerByName(yuriyZhuravlev);
        Player stefanSapic = new Player("Stefan Sapic", new Football(), 32, torpedo);
        torpedo.addPlayerByName(stefanSapic);
        Player volgarAstrakhan = new Player("Volgar Astrakhan", new Football(), 23, torpedo);
        torpedo.addPlayerByName(volgarAstrakhan);
        Player danilaKozlov = new Player("Danila Kozlov", new Football(), 14, torpedo);
        torpedo.addPlayerByName(danilaKozlov);
        Player bojanRoganovic = new Player("Bojan Roganovic", new Football(), 17, torpedo);
        torpedo.addPlayerByName(bojanRoganovic);
        Player artemSamsonov = new Player("Artem Samsonov", new Football(), 24, torpedo);
        torpedo.addPlayerByName(artemSamsonov);
        Player romanYuzepchuk = new Player("Roman Yuzepchuk", new Football(), 47, torpedo);
        torpedo.addPlayerByName(romanYuzepchuk);
        Player evgeniyShlyakov = new Player("Evgeniy Shlyakov", new Football(), 42, torpedo);
        torpedo.addPlayerByName(evgeniyShlyakov);
        Player marioCuric = new Player("Mario Curic", new Football(), 23, torpedo);
        torpedo.addPlayerByName(marioCuric);
        Player igorSavic = new Player("Igor Savic", new Football(), 19, torpedo);
        torpedo.addPlayerByName(igorSavic);

//        7Football Akron Togliatti
        Team akronTogliatti = new Team("Akron Togliatti", "img/AkronTogliatti.png", "Основан в 2018");

        Player sergeyVolkov = new Player("Sergey Volkov", new Football(), 29, akronTogliatti);
        akronTogliatti.addPlayerByName(sergeyVolkov);
        Player vitaliySychev = new Player("Vitaliy Sychev", new Football(), 41, akronTogliatti);
        akronTogliatti.addPlayerByName(vitaliySychev);
        Player dmitriyNagaev = new Player("Dmitriy Nagaev", new Football(), 27, akronTogliatti);
        akronTogliatti.addPlayerByName(dmitriyNagaev);
        Player danilaSagutkin = new Player("Danila Sagutkin", new Football(), 39, akronTogliatti);
        akronTogliatti.addPlayerByName(danilaSagutkin);
        Player dzhamaldinKhodzhaniyazov = new Player("Dzhamaldin Khodzhaniyazov", new Football(), 57, akronTogliatti);
        akronTogliatti.addPlayerByName(dzhamaldinKhodzhaniyazov);
        Player ilyaZuev = new Player("Ilya Zuev", new Football(), 36, akronTogliatti);
        akronTogliatti.addPlayerByName(ilyaZuev);
        Player pavelShakuro = new Player("Pavel Shakuro", new Football(), 44, akronTogliatti);
        akronTogliatti.addPlayerByName(pavelShakuro);
        Player maksimMatveev = new Player("Maksim Matveev", new Football(), 43, akronTogliatti);
        akronTogliatti.addPlayerByName(maksimMatveev);
        Player sergeyMakarov = new Player("Sergey Makarov", new Football(), 57, akronTogliatti);
        akronTogliatti.addPlayerByName(sergeyMakarov);
        Player ivanChudin = new Player("Ivan Chudin", new Football(), 24, akronTogliatti);
        akronTogliatti.addPlayerByName(ivanChudin);
        Player aleksMatsukatov = new Player("Aleks Matsukatov", new Football(), 18, akronTogliatti);
        akronTogliatti.addPlayerByName(aleksMatsukatov);

//        8Football Khimki
        Team khimki = new Team("Khimki", "img/Khimki.png", "Основан в 1997");

        Player antonMitryushkin = new Player("Anton Mitryushkin", new Football(), 22, khimki);
        khimki.addPlayerByName(antonMitryushkin);
        Player vitaliyGudiev = new Player("Vitaliy Gudiev", new Football(), 15, khimki);
        khimki.addPlayerByName(vitaliyGudiev);
        Player leoAndrade = new Player("Léo Andrade", new Football(), 35, khimki);
        khimki.addPlayerByName(leoAndrade);
        Player cristianTassano = new Player("Cristian Tassano", new Football(), 48, khimki);
        khimki.addPlayerByName(cristianTassano);
        Player vitaliyLystsov = new Player("Vitaliy Lystsov", new Football(), 17, khimki);
        khimki.addPlayerByName(vitaliyLystsov);
        Player arturchernyi = new Player("Artur Chernyi", new Football(), 54, khimki);
        khimki.addPlayerByName(arturchernyi);
        Player stefanMelentijevic = new Player("Stefan Melentijevic", new Football(), 44, khimki);
        khimki.addPlayerByName(stefanMelentijevic);
        Player irakliyChezhia = new Player("Irakliy Chezhia", new Football(), 43, khimki);
        khimki.addPlayerByName(irakliyChezhia);
        Player nikolaAntic = new Player("Nikola Antic", new Football(), 49, khimki);
        khimki.addPlayerByName(nikolaAntic);
        Player bryanIdowu = new Player("Bryan Idowu", new Football(), 37, khimki);
        khimki.addPlayerByName(bryanIdowu);
        Player petarGolubovic = new Player("Petar Golubovic", new Football(), 20, khimki);
        khimki.addPlayerByName(petarGolubovic);


//        1Hockey Traktor
        Team traktor = new Team("Traktor", "img/Traktor.png", "Основан в 1947");

        Player antipinViktor = new Player("Antipin Viktor", new Hockey(), 26, traktor);
        traktor.addPlayerByName(antipinViktor);
        Player blazhiyevskyArtyom = new Player("Blazhiyevsky Artyom", new Hockey(), 50, traktor);
        traktor.addPlayerByName(blazhiyevskyArtyom);
        Player burdasovAnton = new Player("Burdasov Anton", new Hockey(), 15, traktor);
        traktor.addPlayerByName(burdasovAnton);
        Player antonBurdasov = new Player("Anton Burdasov", new Hockey(), 14, traktor);
        traktor.addPlayerByName(antonBurdasov);
        Player buteyetsVyacheslav = new Player("Buteyets Vyacheslav", new Hockey(), 24, traktor);
        traktor.addPlayerByName(buteyetsVyacheslav);
        Player chibisovAndrei = new Player("Chibisov Andrei", new Hockey(), 57, traktor);
        traktor.addPlayerByName(chibisovAndrei);

//        2Hockey Lokomotiv
        Team lokomotiv = new Team("Lokomotiv", "img/Lokomotiv.png", "Основан в 1959");

        Player akhunovTimur = new Player("Akhunov Timur", new Hockey(), 22, lokomotiv);
        lokomotiv.addPlayerByName(akhunovTimur);
        Player akmaldinovRaul = new Player("Akmaldinov Raul", new Hockey(), 20, lokomotiv);
        lokomotiv.addPlayerByName(akmaldinovRaul);
        Player alexeyevDenisV = new Player("Alexeyev Denis V.", new Hockey(), 25, lokomotiv);
        lokomotiv.addPlayerByName(alexeyevDenisV);
        Player andronovSergei = new Player("Andronov Sergei", new Hockey(), 44, lokomotiv);
        lokomotiv.addPlayerByName(andronovSergei);
        Player averinYegor = new Player("Averin Yegor", new Hockey(), 34, lokomotiv);
        lokomotiv.addPlayerByName(averinYegor);
        Player belyayevMikhail = new Player("Belyayev Mikhail", new Hockey(), 49, lokomotiv);
        lokomotiv.addPlayerByName(belyayevMikhail);

//        3Hockey Amur
        Team amur = new Team("Amur", "img/Amur.png", "Основан в 1957");

        Player baldayevViktor = new Player("Baldayev Viktor", new Hockey(), 51, amur);
        amur.addPlayerByName(baldayevViktor);
        Player barulinVladislavY = new Player("Barulin Vladislav Y.", new Hockey(), 55, amur);
        amur.addPlayerByName(barulinVladislavY);
        Player bobkovIgor = new Player("Bobkov Igor", new Hockey(), 41, amur);
        amur.addPlayerByName(bobkovIgor);
        Player bocharovStanislav = new Player("Bocharov Stanislav", new Hockey(), 34, amur);
        amur.addPlayerByName(bocharovStanislav);
        Player broadhurstAlex = new Player("Broadhurst Alex", new Hockey(), 35, amur);
        amur.addPlayerByName(broadhurstAlex);
        Player bryntsevAlexander = new Player("Bryntsev Alexander", new Hockey(), 46, amur);
        amur.addPlayerByName(bryntsevAlexander);

//        4hockey Avtomobilist
        Team avtomobilist = new Team("Avtomobilist", "img/Avtomobilist.png", "Основан в 1946");

        Player aksyonovArkady = new Player("Aksyonov Arkady", new Hockey(), 29, avtomobilist);
        avtomobilist.addPlayerByName(aksyonovArkady);
        Player alikinEvgeny = new Player("Alikin Evgeny", new Hockey(), 37, avtomobilist);
        avtomobilist.addPlayerByName(alikinEvgeny);
        Player beizakSergei = new Player("Beizak Sergei", new Hockey(), 36, avtomobilist);
        avtomobilist.addPlayerByName(beizakSergei);
        Player liOleg = new Player("Li Oleg", new Hockey(), 23, avtomobilist);
        avtomobilist.addPlayerByName(liOleg);
        Player grymzinStepan = new Player("Grymzin Stepan", new Hockey(), 52, avtomobilist);
        avtomobilist.addPlayerByName(grymzinStepan);
        Player kizimovSemyon = new Player("Kizimov Semyon", new Hockey(), 54, avtomobilist);
        avtomobilist.addPlayerByName(kizimovSemyon);

//        5hockey Metallurg
        Team metallurg = new Team("Metallurg", "img/Metallugr.png", "Основан в 1955");

        Player akolzinPavel = new Player("Akolzin Pavel", new Hockey(), 29, metallurg);
        metallurg.addPlayerByName(akolzinPavel);
        Player kvartalnovDanila = new Player("Kvartalnov Danila", new Hockey(), 34, metallurg);
        metallurg.addPlayerByName(kvartalnovDanila);
        Player minulinArtyom = new Player("Minulin Artyom", new Hockey(), 56, metallurg);
        metallurg.addPlayerByName(minulinArtyom);
        Player penzinYegor = new Player("Penzin Yegor", new Hockey(), 43, metallurg);
        metallurg.addPlayerByName(penzinYegor);
        Player yurovDanila = new Player("Yurov Danila", new Hockey(), 24, metallurg);
        metallurg.addPlayerByName(yurovDanila);
        Player zernovDenis = new Player("Zernov Denis", new Hockey(), 42, metallurg);
        metallurg.addPlayerByName(zernovDenis);

//        6hockey CSKA
        Team cska = new Team("CSKA", "img/cska.png", "Основан в 1946");

        Player abramovVitaly = new Player("Abramov Vitaly", new Hockey(), 42, cska);
        cska.addPlayerByName(abramovVitaly);
        Player bryutovYegor = new Player("Bryutov Yegor", new Hockey(), 19, cska);
        cska.addPlayerByName(bryutovYegor);
        Player claessonFredrik = new Player("Claesson Fredrik", new Hockey(), 29, cska);
        cska.addPlayerByName(claessonFredrik);
        Player dronykVasily = new Player("Dronyk Vasily", new Hockey(), 19, cska);
        cska.addPlayerByName(dronykVasily);
        Player gamzinDmitry = new Player("Gamzin Dmitry", new Hockey(), 28, cska);
        cska.addPlayerByName(gamzinDmitry);
        Player kanitskyEvgeny = new Player("Kanitsky Evgeny", new Hockey(), 39, cska);
        cska.addPlayerByName(kanitskyEvgeny);

//        7hockey Ak Bars
        Team akBars = new Team("Ak Bars", "img/AkBars.png", "Основан в 1956");

        Player adamchukKirill = new Player("Adamchuk Kirill", new Hockey(), 44, akBars);
        akBars.addPlayerByName(adamchukKirill);
        Player arturAkhtyamov = new Player("Artur Akhtyamov", new Hockey(), 22, akBars);
        akBars.addPlayerByName(arturAkhtyamov);
        Player brovkinArtur = new Player("Brovkin Artur", new Hockey(), 40, akBars);
        akBars.addPlayerByName(brovkinArtur);
        Player chetverikovDaniil = new Player("Chetverikov Daniil", new Hockey(), 25, akBars);
        akBars.addPlayerByName(chetverikovDaniil);
        Player fazylzyanovKamil = new Player("Fazylzyanov Kamil", new Hockey(), 46, akBars);
        akBars.addPlayerByName(fazylzyanovKamil);
        Player ionovSemyon = new Player("Ionov Semyon", new Hockey(), 36, akBars);
        akBars.addPlayerByName(ionovSemyon);

//        8hockey Sibir
        Team sibir = new Team("Sibir", "img/Sibir.png", "Основан в 1962");

        Player akhiyarovTimur = new Player("Akhiyarov Timur", new Hockey(), 19, sibir);
        sibir.addPlayerByName(akhiyarovTimur);
        Player beckTaylor = new Player("Beck Taylor", new Hockey(), 41, sibir);
        sibir.addPlayerByName(beckTaylor);
        Player chmykhovArtyom = new Player("Chmykhov Artyom", new Hockey(), 56, sibir);
        sibir.addPlayerByName(chmykhovArtyom);
        Player mikheyevArtyom = new Player("Mikheyev Artyom", new Hockey(), 28, sibir);
        sibir.addPlayerByName(mikheyevArtyom);
        Player pastukhovIlya = new Player("Pastukhov Ilya", new Hockey(), 55, sibir);
        sibir.addPlayerByName(pastukhovIlya);
        Player sushkoMaxim = new Player("Sushko Maxim", new Hockey(), 32, sibir);
        sibir.addPlayerByName(sushkoMaxim);



















        Team virtus = new Team("Virtus_Pro", "img/Virtus.proLogo.png", "My mind is empty, i dont understand anythink");


        Team spirit = new Team("Team_Spirit", "img/teamSpirit.jpg", "Winner TI10");
        Team spirit2 = new Team("Team_Spirit2", "img/teamSpirit.jpg", "2Winner TI10");
        Team spirit3 = new Team("Team_Spirit3", "img/teamSpirit.jpg", "3Winner TI10");
        Team spirit4 = new Team("Team_Spirit4", "img/teamSpirit.jpg", "4Winner TI10");
        Team spirit5 = new Team("Team_Spirit55", "img/teamSpirit.jpg", "4Winner T0i0I10");

        Player Max = new Player("Max N", new Football(), 37, spirit);
        Player Oleg = new Player("Oleg Mongol", new Football(), 38, spirit);


        virtus.addPlayerByName(Max);
        spirit.addPlayerByName(Oleg);


        Tournament tournament;
        tournament = new Tournament("firstTournament", new Football(), new RoundRobinGrid());
        tournament.addTeam(spirit);
        tournament.addTeam(spirit2);
        tournament.addTeam(spirit3);
        tournament.addTeam(spirit4);
        tournament.addTeam(spirit5);
        tournament.addTeam(virtus);
        TournamentSystem tournamentSystem = new TournamentSystem();
        tournamentSystem.addTournament(tournament);
//       tournamentSystem.displayTournamentSystem();
//        tournament.displayTournament();
        Menu.MainMenu();



    }


}
