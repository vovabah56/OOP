import java.util.ArrayList;

public class Database {
    //              1Football manchester
    public static Team manchester = new Team("Manchester", "img/Manchester.png", "Основан в 1894");
    public static Player manuelAkanji = new Player("Manuel Akanji", new Football(), 45, manchester);
    public static Player nathanAke = new Player("Nathan Ake", new Football(), 26, manchester);
    public static Player joaoCancelo = new Player("Joao Cancelo", new Football(), 30, manchester);
    public static Player rubenDias = new Player("Ruben Dias", new Football(), 24, manchester);
    public static Player sergioGomez = new Player("Sergio Gomez", new Football(), 30, manchester);
    public static Player aymericLaporte = new Player("Aymeric Laporte", new Football(), 55, manchester);
    public static Player ricoLewis = new Player("Rico Lewis", new Football(), 25, manchester);
    public static Player julianAlvarez = new Player("Julian Alvarez", new Football(), 26, manchester);
    public static Player ederson = new Player("Ederson", new Football(), 33, manchester);
    public static Player scottCarson = new Player("Scott Carson", new Football(), 27, manchester);
    public static Player rodrigo = new Player("Rodrigo", new Football(), 49, manchester);

    //              2Football Spartak
    public static Team spartak = new Team("Spartak", "img/Spartak.png", "Основан в 1922");

    public static Player antonShitov = new Player("Anton Shitov", new Football(), 15, spartak);

    public static Player aleksandrSelikhov = new Player("Aleksandr Selikhov", new Football(), 24, spartak);

    public static Player alexisDuarte = new Player("Alexis Duarte", new Football(), 55, spartak);

    public static Player leonKlassen = new Player("Leon Klassen", new Football(), 32, spartak);

    public static Player georgiDzhikiya = new Player("Georgi Dzhikiya", new Football(), 33, spartak);

    public static Player tomasTavares = new Player("Tomas Tavares", new Football(), 35, spartak);

    public static Player pavelMaslov = new Player("Pavel Maslov", new Football(), 14, spartak);

    public static Player nikitaChernov = new Player("Nikita Chernov", new Football(), 36, spartak);

    public static Player victorMoses = new Player("Victor Moses", new Football(), 41, spartak);

    public static Player maciejRybus = new Player("Maciej Rybus", new Football(), 53, spartak);

    public static Player nailUmyarov = new Player("Nail Umyarov", new Football(), 19, spartak);


    //         3Football Krylya Sovetov
    public static Team krylyaSovetov = new Team("Krylya Sovetov", "img/KrylyaSovetov.png", "Основан в 1947");

    public static Player ivanLomaev = new Player("Ivan Lomaev", new Football(), 47, krylyaSovetov);

    public static Player bogdanOvsyannikov = new Player("Bogdan Ovsyannikov", new Football(), 54, krylyaSovetov);

    public static Player evgeniyFrolov = new Player("Evgeniy Frolov", new Football(), 16, krylyaSovetov);

    public static Player romanEvgenjev = new Player("Roman Evgenjev", new Football(), 37, krylyaSovetov);

    public static Player aleksandrSoldatenkov = new Player("Aleksandr Soldatenkov", new Football(), 18, krylyaSovetov);

    public static Player ilyaGaponov = new Player("Ilya Gaponov", new Football(), 28, krylyaSovetov);

    public static Player yuriyGorshkov = new Player("Yuriy Gorshkov", new Football(), 34, krylyaSovetov);

    public static Player glennBijl = new Player("Glenn Bijl", new Football(), 43, krylyaSovetov);

    public static Player fernandoCostanza = new Player("Fernando Costanza", new Football(), 50, krylyaSovetov);

    public static Player maksimVityugov = new Player("Maksim Vityugov", new Football(), 17, krylyaSovetov);

    public static Player amarRahmanovic = new Player("Amar Rahmanovic", new Football(), 54, krylyaSovetov);


    //        4Football Orenburg
    public static Team orenburg = new Team("Orenburg", "img/Orenburg.png", "Основан в 1976");

    public static Player nikolaySysuev = new Player("Nikolay Sysuev", new Football(), 30, orenburg);

    public static Player alekseyKenyaykin = new Player("Aleksey Kenyaykin", new Football(), 14, orenburg);

    public static Player evgeniyGoshev = new Player("Evgeniy Goshev", new Football(), 15, orenburg);

    public static Player renatoGojkovic = new Player("Renato Gojkovic", new Football(), 38, orenburg);

    public static Player matiasPerez = new Player("Matías Pérez", new Football(), 46, orenburg);

    public static Player danilaKhotulev = new Player("Danila Khotulev", new Football(), 56, orenburg);

    public static Player mikhailSivakov = new Player("Mikhail Sivakov", new Football(), 35, orenburg);

    public static Player mateoStamatov = new Player("Mateo Stamatov", new Football(), 48, orenburg);

    public static Player vladimirPoluyakhtov = new Player("Vladimir Poluyakhtov", new Football(), 16, orenburg);

    public static Player andreyMalykh = new Player("Andrey Malykh", new Football(), 44, orenburg);

    public static Player aleksandrEktov = new Player("Aleksandr Ektov", new Football(), 26, orenburg);


    //        5Football KamAZ
    public static Team kamAZ = new Team("KamAZ", "img/KamAZ.png", "Основан в 1969");

    public static Player alekseyMamin = new Player("Aleksey Mamin", new Football(), 20, kamAZ);

    public static Player alekseySmirnov = new Player("Aleksey Smirnov", new Football(), 25, kamAZ);

    public static Player vladislavVasiljev = new Player("Vladislav Vasiljev", new Football(), 41, kamAZ);

    public static Player alekseyGerasimov = new Player("Aleksey Gerasimov", new Football(), 15, kamAZ);

    public static Player nikolayTolstopyatov = new Player("Nikolay Tolstopyatov", new Football(), 36, kamAZ);

    public static Player antonPolyutkin = new Player("Anton Polyutkin", new Football(), 44, kamAZ);

    public static Player aleksandrKulikov = new Player("Aleksandr Kulikov", new Football(), 19, kamAZ);

    public static Player amirMokhammad = new Player("Amir Mokhammad", new Football(), 26, kamAZ);

    public static Player valentinPaltsev = new Player("Valentin Paltsev", new Football(), 35, kamAZ);

    public static Player ruslanAyukin = new Player("Ruslan Ayukin", new Football(), 40, kamAZ);

    public static Player dinarShaykhutdinov = new Player("Dinar Shaykhutdinov", new Football(), 18, kamAZ);


    //        6Football Torpedo
    public static Team torpedo = new Team("Torpedo", "img/Torpedo.png", "Основан в 1924");

    public static Player vitaliyBotnar = new Player("Vitaliy Botnar", new Football(), 51, torpedo);

    public static Player yuriyZhuravlev = new Player("Yuriy Zhuravlev", new Football(), 42, torpedo);

    public static Player stefanSapic = new Player("Stefan Sapic", new Football(), 32, torpedo);

    public static Player volgarAstrakhan = new Player("Volgar Astrakhan", new Football(), 23, torpedo);

    public static Player danilaKozlov = new Player("Danila Kozlov", new Football(), 14, torpedo);

    public static Player bojanRoganovic = new Player("Bojan Roganovic", new Football(), 17, torpedo);

    public static Player artemSamsonov = new Player("Artem Samsonov", new Football(), 24, torpedo);

    public static Player romanYuzepchuk = new Player("Roman Yuzepchuk", new Football(), 47, torpedo);

    public static Player evgeniyShlyakov = new Player("Evgeniy Shlyakov", new Football(), 42, torpedo);

    public static Player marioCuric = new Player("Mario Curic", new Football(), 23, torpedo);

    public static Player igorSavic = new Player("Igor Savic", new Football(), 19, torpedo);


    //        7Football Akron Togliatti
    public static Team akronTogliatti = new Team("Akron Togliatti", "img/AkronTogliatti.png", "Основан в 2018");

    public static Player sergeyVolkov = new Player("Sergey Volkov", new Football(), 29, akronTogliatti);

    public static Player vitaliySychev = new Player("Vitaliy Sychev", new Football(), 41, akronTogliatti);

    public static Player dmitriyNagaev = new Player("Dmitriy Nagaev", new Football(), 27, akronTogliatti);

    public static Player danilaSagutkin = new Player("Danila Sagutkin", new Football(), 39, akronTogliatti);

    public static Player dzhamaldinKhodzhaniyazov = new Player("Dzhamaldin Khodzhaniyazov", new Football(), 57, akronTogliatti);

    public static Player ilyaZuev = new Player("Ilya Zuev", new Football(), 36, akronTogliatti);

    public static Player pavelShakuro = new Player("Pavel Shakuro", new Football(), 44, akronTogliatti);

    public static Player maksimMatveev = new Player("Maksim Matveev", new Football(), 43, akronTogliatti);

    public static Player sergeyMakarov = new Player("Sergey Makarov", new Football(), 57, akronTogliatti);

    public static Player ivanChudin = new Player("Ivan Chudin", new Football(), 24, akronTogliatti);

    public static Player aleksMatsukatov = new Player("Aleks Matsukatov", new Football(), 18, akronTogliatti);


    //        8Football Khimki
    public static Team khimki = new Team("Khimki", "img/Khimki.png", "Основан в 1997");

    public static Player antonMitryushkin = new Player("Anton Mitryushkin", new Football(), 22, khimki);

    public static Player vitaliyGudiev = new Player("Vitaliy Gudiev", new Football(), 15, khimki);

    public static Player leoAndrade = new Player("Léo Andrade", new Football(), 35, khimki);

    public static Player cristianTassano = new Player("Cristian Tassano", new Football(), 48, khimki);

    public static Player vitaliyLystsov = new Player("Vitaliy Lystsov", new Football(), 17, khimki);

    public static Player arturchernyi = new Player("Artur Chernyi", new Football(), 54, khimki);

    public static Player stefanMelentijevic = new Player("Stefan Melentijevic", new Football(), 44, khimki);

    public static Player irakliyChezhia = new Player("Irakliy Chezhia", new Football(), 43, khimki);

    public static Player nikolaAntic = new Player("Nikola Antic", new Football(), 49, khimki);

    public static Player bryanIdowu = new Player("Bryan Idowu", new Football(), 37, khimki);

    public static Player petarGolubovic = new Player("Petar Golubovic", new Football(), 20, khimki);



    //        1Hockey Traktor
    public static Team traktor = new Team("Traktor", "img/Traktor.png", "Основан в 1947");

    public static Player antipinViktor = new Player("Antipin Viktor", new Hockey(), 26, traktor);

    public static Player blazhiyevskyArtyom = new Player("Blazhiyevsky Artyom", new Hockey(), 50, traktor);

    public static Player burdasovAnton = new Player("Burdasov Anton", new Hockey(), 15, traktor);

    public static Player antonBurdasov = new Player("Anton Burdasov", new Hockey(), 14, traktor);

    public static Player buteyetsVyacheslav = new Player("Buteyets Vyacheslav", new Hockey(), 24, traktor);

    public static Player chibisovAndrei = new Player("Chibisov Andrei", new Hockey(), 57, traktor);


    //        2Hockey Lokomotiv
    public static Team lokomotiv = new Team("Lokomotiv", "img/Lokomotiv.png", "Основан в 1959");

    public static Player akhunovTimur = new Player("Akhunov Timur", new Hockey(), 22, lokomotiv);

    public static Player akmaldinovRaul = new Player("Akmaldinov Raul", new Hockey(), 20, lokomotiv);

    public static Player alexeyevDenisV = new Player("Alexeyev Denis V.", new Hockey(), 25, lokomotiv);

    public static Player andronovSergei = new Player("Andronov Sergei", new Hockey(), 44, lokomotiv);

    public static Player averinYegor = new Player("Averin Yegor", new Hockey(), 34, lokomotiv);

    public static Player belyayevMikhail = new Player("Belyayev Mikhail", new Hockey(), 49, lokomotiv);


    //        3Hockey Amur
    public static Team amur = new Team("Amur", "img/Amur.png", "Основан в 1957");

    public static Player baldayevViktor = new Player("Baldayev Viktor", new Hockey(), 51, amur);

    public static Player barulinVladislavY = new Player("Barulin Vladislav Y.", new Hockey(), 55, amur);

    public static Player bobkovIgor = new Player("Bobkov Igor", new Hockey(), 41, amur);

    public static Player bocharovStanislav = new Player("Bocharov Stanislav", new Hockey(), 34, amur);

    public static Player broadhurstAlex = new Player("Broadhurst Alex", new Hockey(), 35, amur);

    public static Player bryntsevAlexander = new Player("Bryntsev Alexander", new Hockey(), 46, amur);


    //        4hockey Avtomobilist
    public static Team avtomobilist = new Team("Avtomobilist", "img/Avtomobilist.png", "Основан в 1946");

    public static Player aksyonovArkady = new Player("Aksyonov Arkady", new Hockey(), 29, avtomobilist);

    public static Player alikinEvgeny = new Player("Alikin Evgeny", new Hockey(), 37, avtomobilist);

    public static Player beizakSergei = new Player("Beizak Sergei", new Hockey(), 36, avtomobilist);

    public static Player liOleg = new Player("Li Oleg", new Hockey(), 23, avtomobilist);

    public static Player grymzinStepan = new Player("Grymzin Stepan", new Hockey(), 52, avtomobilist);

    public static Player kizimovSemyon = new Player("Kizimov Semyon", new Hockey(), 54, avtomobilist);


    //        5hockey Metallurg
    public static Team metallurg = new Team("Metallurg", "img/Metallugr.png", "Основан в 1955");

    public static Player akolzinPavel = new Player("Akolzin Pavel", new Hockey(), 29, metallurg);

    public static Player kvartalnovDanila = new Player("Kvartalnov Danila", new Hockey(), 34, metallurg);

    public static Player minulinArtyom = new Player("Minulin Artyom", new Hockey(), 56, metallurg);

    public static Player penzinYegor = new Player("Penzin Yegor", new Hockey(), 43, metallurg);

    public static Player yurovDanila = new Player("Yurov Danila", new Hockey(), 24, metallurg);

    public static Player zernovDenis = new Player("Zernov Denis", new Hockey(), 42, metallurg);


    //        6hockey CSKA
    public static Team cska = new Team("CSKA", "img/cska.png", "Основан в 1946");

    public static Player abramovVitaly = new Player("Abramov Vitaly", new Hockey(), 42, cska);

    public static Player bryutovYegor = new Player("Bryutov Yegor", new Hockey(), 19, cska);

    public static Player claessonFredrik = new Player("Claesson Fredrik", new Hockey(), 29, cska);

    public static Player dronykVasily = new Player("Dronyk Vasily", new Hockey(), 19, cska);

    public static Player gamzinDmitry = new Player("Gamzin Dmitry", new Hockey(), 28, cska);

    public static Player kanitskyEvgeny = new Player("Kanitsky Evgeny", new Hockey(), 39, cska);


    //        7hockey Ak Bars
    public static Team akBars = new Team("Ak Bars", "img/AkBars.png", "Основан в 1956");

    public static Player adamchukKirill = new Player("Adamchuk Kirill", new Hockey(), 44, akBars);

    public static Player arturAkhtyamov = new Player("Artur Akhtyamov", new Hockey(), 22, akBars);

    public static Player brovkinArtur = new Player("Brovkin Artur", new Hockey(), 40, akBars);

    public static Player chetverikovDaniil = new Player("Chetverikov Daniil", new Hockey(), 25, akBars);

    public static Player fazylzyanovKamil = new Player("Fazylzyanov Kamil", new Hockey(), 46, akBars);

    public static Player ionovSemyon = new Player("Ionov Semyon", new Hockey(), 36, akBars);


    //        8hockey Sibir
    public static Team sibir = new Team("Sibir", "img/Sibir.png", "Основан в 1962");

    public static Player akhiyarovTimur = new Player("Akhiyarov Timur", new Hockey(), 19, sibir);

    public static Player beckTaylor = new Player("Beck Taylor", new Hockey(), 41, sibir);

    public static Player chmykhovArtyom = new Player("Chmykhov Artyom", new Hockey(), 56, sibir);

    public static Player mikheyevArtyom = new Player("Mikheyev Artyom", new Hockey(), 28, sibir);

    public static Player pastukhovIlya = new Player("Pastukhov Ilya", new Hockey(), 55, sibir);

    public static Player sushkoMaxim = new Player("Sushko Maxim", new Hockey(), 32, sibir);



    //        1Backetball Boston Celtics
    public static Team bostonCeltics = new Team("Boston Celtics", "img/BostonCeltics.png", "Основан в 1946");

    public static Player malcolmBrogdon = new Player("Malcolm Brogdon", new Backetball(), 36, bostonCeltics);

    public static Player jaylenBrown = new Player("Jaylen Brown", new Backetball(), 24, bostonCeltics);

    public static Player justinChampagnie = new Player("Justin Champagnie", new Backetball(), 34, bostonCeltics);

    public static Player lukeKornet = new Player("Luke Kornet", new Backetball(), 21, bostonCeltics);

    public static Player derrickWhite = new Player("Derrick White", new Backetball(), 50, bostonCeltics);


    //        2Backetball Atlanta Hawks
    public static Team atlantaHawks = new Team("Atlanta Hawks", "img/AtlantaHawks.png", "Основан в 1946");

    public static Player saddiqBey = new Player("Saddiq Bey", new Backetball(), 41, atlantaHawks);

    public static Player clintCapela = new Player("Clint Capela", new Backetball(), 14, atlantaHawks);

    public static Player trentForrest = new Player("Trent Forrest", new Backetball(), 26, atlantaHawks);

    public static Player aaronHoliday = new Player("Aaron Holiday", new Backetball(), 36, atlantaHawks);

    public static Player vitKrejci = new Player("Vit Krejci", new Backetball(), 54, atlantaHawks);


    //        3Backetball Miami Heat
    public static Team miamiHeat = new Team("Miami Heat", "img/MiamiHeat.png", "Основан в 1988");

    public static Player bamAdebay = new Player("Bam Adebay", new Backetball(), 38, miamiHeat);

    public static Player jamalCain = new Player("Jamal Cain", new Backetball(), 46, miamiHeat);

    public static Player nikolaJovic = new Player("Nikola Jovic", new Backetball(), 21, miamiHeat);

    public static Player victorOladipo = new Player("Victor Oladipo", new Backetball(), 43, miamiHeat);

    public static Player maxStrus = new Player("Max Strus", new Backetball(), 42, miamiHeat);


    //        4Backetball Milwaukee Bucks
    public static Team milwaukeeBucks = new Team("Milwaukee Bucks", "img/MilwaukeeBucks.png", "Основан в 1968");

    public static Player graysonAllen = new Player("Grayson Allen", new Backetball(), 39, milwaukeeBucks);

    public static Player joeIngles = new Player("Joe Ingles", new Backetball(), 16, milwaukeeBucks);

    public static Player brookLopez = new Player("Brook Lopez", new Backetball(), 30, milwaukeeBucks);

    public static Player khrisMiddleton = new Player("Khris Middleton", new Backetball(), 48, milwaukeeBucks);

    public static Player jaeCrowder = new Player("Jae Crowder", new Backetball(), 37, milwaukeeBucks);


    //        5Backetball New York Knicks
    public static Team newYorkKnicks = new Team("New York Knicks", "img/NewYorkKnicks.png", "Основан в 1946");

    public static Player rJBarrett = new Player("RJ Barrett", new Backetball(), 32, newYorkKnicks);

    public static Player jalenBrunson = new Player("Jalen Brunson", new Backetball(), 29, newYorkKnicks);

    public static Player joshHart = new Player("Josh Hart", new Backetball(), 55, newYorkKnicks);

    public static Player trevorKeels = new Player("Trevor Keels", new Backetball(), 27, newYorkKnicks);

    public static Player mitchellRobinson = new Player("Mitchell Robinsont", new Backetball(), 47, newYorkKnicks);


    //        6Backetball Denver Nuggets
    public static Team denverNuggets = new Team("Denver Nuggets", "img/DenverNuggets.png", "Основан в 1967");

    public static Player deAndreJordan = new Player("DeAndre Jordan", new Backetball(), 40, denverNuggets);

    public static Player reggieJackson = new Player("Reggie Jackson", new Backetball(), 45, denverNuggets);

    public static Player jamalMurray = new Player("Jamal Murray", new Backetball(), 26, denverNuggets);

    public static Player kentaviousCaldwellPope = new Player("Kentavious Caldwell-Pope", new Backetball(), 18, denverNuggets);

    public static Player thomasBryant = new Player("Thomas Bryant", new Backetball(), 32, denverNuggets);


    //        7Backetball Chicago Bulls
    public static Team chicagoBulls = new Team("Chicago Bulls", "img/ChicagoBulls.png", "Основан в 1966");

    public static Player patrickBeverley = new Player("Patrick Beverley", new Backetball(), 55, chicagoBulls);

    public static Player ayoDosunmu = new Player("Ayo Dosunmu", new Backetball(), 42, chicagoBulls);

    public static Player andreDrummond = new Player("Andre Drummond", new Backetball(), 35, chicagoBulls);

    public static Player carlikJones = new Player("Carlik Jones", new Backetball(), 18, chicagoBulls);

    public static Player patrickWilliams = new Player("Patrick Williams", new Backetball(), 14, chicagoBulls);


    //        8Backetball Toronto Raptors
    public static Team torontoRaptors = new Team("Toronto Raptors", "img/TorontoRaptors.png", "Основан в 1995");
    public static Player preciousAchiuwa = new Player("Precious Achiuwa", new Backetball(), 28, torontoRaptors);
    public static Player oGAnunoby = new Player("O.G. Anunoby", new Backetball(), 39, torontoRaptors);
    public static Player scottieBarnes = new Player("Scottie Barnes", new Backetball(), 36, torontoRaptors);
    public static Player chrisBoucher = new Player("Chris Boucher", new Backetball(), 24, torontoRaptors);
    public static Player pascalSiakam = new Player("Pascal Siakam", new Backetball(), 27, torontoRaptors);



}