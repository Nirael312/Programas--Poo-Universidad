class Recomendados:
    
    def __init__(self, titulo):
        self.__titulo = titulo
        self.__cursos = []
    
    def agrego_cursos (self, curso):
        self.__cursos.append(curso)
        
    def muestro_recomendados (self):
        print()
        print(self.__titulo)
        print()
        for var in self.__cursos:
            
            var.imprimo_datos()