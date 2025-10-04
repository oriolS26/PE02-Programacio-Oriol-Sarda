import java.util.Scanner;

public class PE02_OriolSarda_exercici_presa_decisions {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        boolean espasa,entrarCastell,rodegar,pou,entradaEstreta,pergami,altar,resar;
        int decisio1;

        entrarCastell = false;
        rodegar = false;


        System.out.println("És l any 1333. Ets un jove caballer que serveix a l’imperi de Catalunya. El teu rey t’envia a explorar un castell a les terres properes, amb el nom de Raul Belly, fa varies dècades que està abandonat.");
        System.out.println("En arribar al camí de pujada, trobes una espasa vella.");
        System.out.println("Vols agafar l espasa? (true/false)");
        espasa = e.nextBoolean();

        if (espasa == true)
        {
            System.out.println("Decideixes agafar l’espasa i continuar el camí.");
        }
        else if (espasa == false)
        {
            System.out.println("Decideixes no agafar l’espasa i continuar el camí).");
        }
            System.out.println("Arribes al davant del castell");
            System.out.println("Et trobes amb 2 opcions les quals son rodegar el castell per inspeccionar el cami o entrara directament al castell.");
            System.out.println("Vols entrar al castell? (1) o Vols rodegar el castell? (2)");
            decisio1 = e.nextInt();

            if (decisio1 == 1)
            {
            System.out.println("Decideixes entrar al castell.");
            entrarCastell = true;
            }
            else if (decisio1 == 2)
            {
            System.out.println("Decideixes rodegar el castell.");
            rodegar = true;
            }
            else
            {
                System.out.println("Opció no vàlida. Tria 1 o 2.");
            }
            if (entrarCastell == true)
            {
                System.out.println("Si entres directament, et trobes una sala amb roba estripada, unes escales que pujen i un cofre mig trencat.");
                System.out.println("Tens 2 opcions, pujar les escales (1) o intentar obrir un cofre mig trencat (2)");
                decisio1 = e.nextInt();

                if (decisio1 == 1)
                {
                    System.out.println("Si pujes l’escala, dalt hi ha una porta la qual requereix una clau. Intentes forçar la porta, però el terra col·lapsa degut a la mala condició del castell i caus lesionante les cames.");
                    System.out.println("Final tràgic (No pots continuar ja que et lesiones greument).");
                }   
                else if (decisio1 == 2 && espasa == true)
                {
                    System.out.println("Si tens l’espasa vella, pots forçar el cofre i et trobes una clau rovellada");
                    System.out.println("Pujes l'escala i obres la porta amb la clau rovellada. Descobreixes un cofre amb monedes d or i un llibre amb informació del castell Raul Belly");
                    System.out.println("Final B(Positiu) (Het fas ric i trobes un llibre molt important)");
                }
                else if (decisio1 == 2 && espasa == false)
                {
                    System.out.println("Si no tens l’espasa vella, no pots obrir el cofre.");
                    System.out.println("Pujes per l'escala i intentes forçar la porta, però el terra col·lapsa degut a la mala condició del castell i caus lesionante les cames.");
                    System.out.println("Final tràgic (No pots continuar ja que et lesiones greument).");
                }
            if (rodegar == true)
            {
                System.out.println("Si rodeges el castell per inspeccionar el camí i et trobes un pou antic i una entrada al castell estreta");
                System.out.println("Tens 2 opcions, entrar per la entrada estreta (1) o investigar el pou antic (2)");
                decisio1 = e.nextInt();
                if (decisio1 ==1)
                {
                    System.out.println("Si decideixes entrar per la porta estreta, accedeixes a una sala amb un altar de pedra.");
                    System.out.println("Tens 2 opcions, Pots intentar moure l'altar (1), o pots resar i sortir (2).");
                    decisio1 = e.nextInt();
                    if (decisio1 == 1)
                    {
                        System.out.println("Et canses d’intentar moure l’alter i surts del castell sense res.");
                        System.out.println("Final neutre (No aconsegueixes res).");
                    }
                    else if (decisio1 ==2)
                    {
                        System.out.println("Si reses i surts no aconsegueixes res");
                        System.out.println("Final neutre (No aconsegueixes res).");
                    }
                }
                else if (decisio1 == 2 && espasa ==true)
                {
                    System.out.println("Si decideixes investigar el pou, trobes un pergamí protegit dins un tub. Si tens l’espasa vella, pots tellar el tub, al llegir el pergamí et dones compte que hi ha un tresor amagat sota l’altar.");
                    System.out.println("Seguidament, entres per la entrada estreta.");
                    System.out.println("Tens 2 opcions, Pots intentar moure l'altar (1), o pots resar i sortir (2).");
                    decisio1 = e.nextInt();
                    if (decisio1 == 1)
                    {
                        System.out.println("Si decideixes moure l'altar, trobes un cofre amb monedes d'or.");
                        System.out.println("Final A(Positiu) (Het fas ric i trobes el tresor perdut)");
                    }
                    else if (decisio1 ==2)
                    {
                        System.out.println("Si reses i surts no aconsegueixes res");
                        System.out.println("Final neutre (No aconsegueixes res).");
                    }
                }
                else if (decisio1 == 2 && espasa ==false)
                {
                    System.out.println("Si decideixes investigar el pou, trobes un pergamí protegit dins un tub. Com no tens l’espasa vella, no pots trencar el tub per agafar el pergamí.");
                    System.out.println("Seguidament, entres per la entrada estreta.");
                    System.out.println("Tens 2 opcions, Pots intentar moure l'altar (1), o pots resar i sortir (2).");
                    decisio1 = e.nextInt();
                    if (decisio1 == 1)
                    {
                        System.out.println("Et canses d’intentar moure l’alter i surts del castell sense res.");
                        System.out.println("Final neutre (No aconsegueixes res).");
                    }
                    else if (decisio1 ==2)
                    {
                        System.out.println("Si reses i surts no aconsegueixes res");
                        System.out.println("Final neutre (No aconsegueixes res).");
                    }
                }
            }
        }
    }
 }
    
