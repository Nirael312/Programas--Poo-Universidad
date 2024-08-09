class Curso:
    
    def __init__(self, img, nombre, precio, autores, calificacion):
        self.__img = img
        self.__nombre = nombre
        self.__precio = precio
        self.__autores = autores
        self.__calificacion = calificacion
        
        
    def imprimo_datos(self):
        print( "{} - {} - {} - {} - {} ".format(self.__img, self.__nombre, self.__precio, self.__autores, self.__calificacion))