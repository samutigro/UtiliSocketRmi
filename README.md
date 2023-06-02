PROGRAMMAZIONE CONCORRENTE: DOMANDE TEORIA
1. QUANDO UN THREAD ESEGUE UNA NOTIFY, QUALE DEI SEGUENTI EVENTI SI VERIFICA?
a. Viene sbloccato un thread fra tutti quelli in Wait.
2. CALL BACK BASATE SU RMI, QUALE DELLE AFFERMAZIONI È VERA?
a. Il server chiama un metodo del client, di cui possiede un riferimento remoto.
3. QUALE DELLE SEGUENTI CONDIZIONI DEVE ESSERE SODDISFATTA PER CREARE UN SERVER CAPACE DI GESTIRE PIU’ CONNESSIONI IN CONTEMPORANEA?
a. Far gestire ogni Socket creato da ServerSocket.accept ad un nuovo Thread.
4. QUAL’E L’EFFETTO DELLA “BARRIER” SULLA SINCRONIZZAZIONE TRA THREAD?
a. Bloccare i thread alla barriera fino a quando non sono giunti tutti, poi sbloccarli tutti insieme.
5. DIRE QUALI AFFERMAZIONI RIGUARDANDI UN OGGETTO SKELETON È VERA?
a. La funzione principale dello skeleton è sollevare un server dalla gestione delle comunicazioni.
6. QUALE DELLE SEGUENTI CONDIZIONI DEVE ESSERE VERIFICATA PERCHE’ UN CLIENT REMOTO POSSA INVIARE UN MESSAGGIO AD UN SERVER REMOTO?
a. Il client ha ottenuto il riferimento remoto del server dal registry o altrimenti (es. da un altro oggetto).
7. A COSA SERVE LO SCHEDULER DELLA JVM?
a. Stabilisce quale thread mandare in esecuzione selezionandolo dal ready set.
8. QUALE TRA I SEGUENTI PROBLEMI AFFRONTA IL PATTERN PRODUTTORE/CONSUMATORE?
a. Assicurare che il produttore non cerchi di inserire nuovi dati se il buffer è pieno, e che il consumatore non cerchi di estrarre dati se il buffer è vuoto.
9. CHE TIPO DI PROTOCOLLO VIENE USATO DA UNA SERVER SOCKET PER FAR COMUNICARE CLIENT E SERVER?
a. TCP.
10. QUAL’E’ L’EFFETTO DELL’ISTRUZIONE THREAD SLEEP (X)?
a. Addormenta il Thread corrente per X millisecondi.
11. QUAL È LA FUNZIONE DEL REGISTRY IN RMI?
a. Fornire al client il riferimento al Server.
12. QUAL È L’EFFETTO DI UNA SINCRONIZZAZIONE DI TIPO “BARRIER” QUANDO LA BARRIERA È INIZIALIZZATA CON UN PARAMETRO UGUALE A 10?
a. I task in attesa sulla barriera sono sbloccati alla decima chiamata del metodo waitB.
 
13. COSA SI INTENDE PER CALLBACK?
a. Il fatto che il server chiama metodi dal client.
14. DIRE QUALI AFFERMAZIONI RIGUARDANDI UN OGGETTO PROXY È VERA?
a. La funzione principale del proxy è sollevare un client dalla gestione delle comunicazioni.
15. SAPENDO CHE UN PROGRAMMA JAVA IN ESECUZIONE SU UN SOLO PROCESSORE, E CONTIENE N THREAD NELLO STATO DI READY...
a. È impossibile stabilire la sequenza di esecuzione degli N threadàNON DETERMINISMO.
16. QUALE DELLE SEGUENTI CONDIZIONI DEVE ESSERE SODDISFATTA PER IMPLEMENTARE IN JAVA IL PROBLEMA DEL PRODUTTORE/CONSUMATORE?
a. Gli oggetti di tipo Produttore e Consumatore devono essere dei Thread.
17. SI CONSIDERINO I SEGUENTI DUE BLOCCHI DI CODICE:
a. Thread.sleep non rilascia il lock in suo possesso, mentre wait rilascia il lock sull’oggetto this.
18. PER IDENTIFICARE UN SERVER IN MODO UNIVOCO?
a. Il client deve conoscere l’indirizzo IP e PORTA del Server.
19. NEL PATTERN OBSERVER, QUALE DELLE SEGUENTI AFFERMAZIONI È VERA?
a. Gli Observer mettono a disposizione dell’oggetto osservato un metodo per comunicare notifiche.
20. QUAL’E’ L’EFFETTO DELL’ISTRUZIONE T.JOIN () DELLA CLASSE THREAD?
a. Attendere la terminazione del thread t.
21. SI CONSIDERI IL SEGUENTE CODICE
  a. L’istruzione c1 += c2 può essere eseguita da un numero indefinito di Thread insieme.
22. QUALE DELLE SEGUENTI AFFERMAZIONI È VERA, RIGUARDO AGLI ARGOMENTI DEI METODI REMOTI IN RMI?
a. Gli argomenti di tipo primitivo non sono serializzati.
