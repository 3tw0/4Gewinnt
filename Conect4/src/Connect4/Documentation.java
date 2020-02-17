package Connect4;

//BoardNumbers
//soll die nummern 1-7 am unteren ende des feldes anzeigen zur besseren visualisierung und platzierung der steine

//BoardStorage
//initialisiert ein neues 2D array mit [7][6] einträgen / beim erschaffen des feldes wird es mit ("") gefüllt
//weiß noch nicht ob wir es brauchen: Idee -> wenn ein spieler einen stein platziert wird der wert im array geändert aber
//hashsets sind glaub besser dafür und zum win check / store(speichert den gegebenen input an der stelle x,y) und getter

//Connect4Board
//zeichnet das ursprüngliche spielfeld / constructor ruft drawBoard methode auf
// !! noch nicht sicher wie es funktionieren soll sobald ein spieler einen stein platziert ob dann jedes mal das feld
// neu geladen wird, dann brüchte man irwie das array doch zum speichern wo jetzt was ist und das dann zu malen, oder 
//ob das dynamisch geht und dann nur imme rüber das ursprüngliche gelegt wird.

//DrawElemenet
//constructor mal einfach die leeren Felder -> mann könnte eig auch so verändern das auch der normale constructor auch
//die spieler felder zeichnet dann müsste man aber auch noch ne farbe übergeben und x,y koordinaten

//Player
//bis jetzt nur nen player mit nem namen und ner farbe -> getter/setter
//hashset zum speichern der stelle nan denen der spieler seine steine platziert hat, könnte schwierig werden da ja die
//steine ja in der entsprechenden zeile immer bis auf den boden/höchsten stein rutschen





//In PlayGame statt println() lieber gLabels einbauen