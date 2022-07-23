class Solution:
    def canFormArray(self, arr: List[int], pieces: List[List[int]]) -> bool:
        mapper=dict()
        for index,n in enumerate(pieces):
            mapper[n[0]]=index
        arr_ind=0
        piece_ind=0
        temp=None
        while(arr_ind<len(arr)):
            if(temp==None):
                try:
                    temp=pieces[mapper[arr[arr_ind]]]
                    piece_ind=0
                except KeyError:
                    return False
                    
            else:
                if(piece_ind<len(temp)):
                    if(temp[piece_ind]==arr[arr_ind]):
                        arr_ind+=1
                        piece_ind+=1
                    else:
                        return False
                else:
                    temp=None
        return True
    
                
        
                
        